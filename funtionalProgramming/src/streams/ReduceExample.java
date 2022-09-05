package streams;

import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {

       String names = Stream.of("Jorge Uribe",
                        "Andres Agudelo",
                        "Jorge Uribe",
                        "Karolyn Velez",
                        "Jorge Uribe",
                        "Mario Vargas",
                        "Jorge Mendez")
                .distinct()
                .reduce("", (firstName, secondName) -> firstName + ", " + secondName);

        System.out.println(names);

        Integer sum = Stream.of(5, 10, 15, 20)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
