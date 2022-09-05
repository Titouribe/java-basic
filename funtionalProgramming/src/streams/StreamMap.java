package streams;

import streams.model.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    public static void main(String[] args) {
        //Map is an intermediate operation because this one transform the data and return the data with the modification.

        /* Stream<String> names = Stream.of("Juan", "Andres", "Luis", "Jorge", "Jose", "Mario")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
                //.peek(System.out::println);

         */
        //names.forEach(System.out::println);

        //Convert type Stream to List

        /*
        List<String> nameList = names.collect(Collectors.toList());

        nameList.forEach(System.out::println);
         */

        // Convert Stream of Strings to Stream of Users

        Stream<User> names = Stream.of("Juan Rodriguez", "Andres Agudelo", "Jorge Uribe", "Jose Maria", "Mario Vargas")
                .map(name -> name.split(" "))
                .map(arrayNames -> new User(arrayNames[0], arrayNames[1]))
                .peek(user -> System.out.println(user.getName()))
                .map(user -> {
                    user.setName(user.getName().toUpperCase());
                    user.setLastName(user.getLastName().toUpperCase());
                    return user;
                });

        List<User> users = names.collect(Collectors.toList());

        users.forEach(user -> System.out.println(user.getName() + " " + user.getLastName()));

    }
}
