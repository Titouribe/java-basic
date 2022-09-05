package streams;

import streams.model.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {

        Stream<User> names = Stream.of("Juan Rodriguez",
                        "Andres Agudelo",
                        "Jorge Uribe",
                        "Jose Maria",
                        "Mario Vargas",
                        "Jorge Mendez")
                .map(name -> name.split(" "))
                .map(arrayNames -> new User(arrayNames[0], arrayNames[1]))
                .filter(user -> user.getName().equals("Jorge"));

        List<User> users = names.collect(Collectors.toList());

        users.forEach(user -> System.out.println(user.getName() + " " + user.getLastName()));
    }
}
