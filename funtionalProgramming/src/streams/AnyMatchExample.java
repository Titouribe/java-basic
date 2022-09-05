package streams;

import streams.model.User;

import java.util.stream.Stream;

public class AnyMatchExample {
    public static void main(String[] args) {

        Boolean isPresent = Stream.of("Juan Rodriguez",
                        "Andres Agudelo",
                        "Jorge Uribe",
                        "Jose Maria",
                        "Mario Vargas",
                        "Jorge Mendez")
                .map(name -> name.split(" "))
                .map(arrayNames -> new User(arrayNames[0], arrayNames[1]))
                .peek(System.out::println)
                .anyMatch(user -> user.getName().equals("Jorge"));

        System.out.println(isPresent);
    }
}
