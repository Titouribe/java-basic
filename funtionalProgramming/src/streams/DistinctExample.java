package streams;

import java.util.stream.Stream;

public class DistinctExample {
    public static void main(String[] args) {

        Stream.of("Jorge Uribe",
                "Andres Agudelo",
                "Jorge Uribe",
                "Karolyn Velez",
                "Jorge Uribe",
                "Mario Vargas",
                "Jorge Mendez")
                .distinct()
                .forEach(System.out::println);

    }
}
