package streams;

import streams.model.User;

import java.util.stream.Stream;

public class CountExample {
    public static void main(String[] args) {

        long count = Stream.of("Juan Rodriguez",
                        "Andres Agudelo",
                        "Jorge Uribe",
                        "Jose Maria",
                        "Mario Vargas",
                        "Jorge Mendez")
                .map(name -> name.split(" "))
                .map(arrayNames -> new User(arrayNames[0], arrayNames[1]))
                .peek(System.out::println)
                .count();


        System.out.println(count);
    }
}
