package streams;

import streams.model.User;

import java.util.stream.Stream;

public class FilterEmptyExample {
    public static void main(String[] args) {

        Long countEmptyNames = Stream.of("",
                "Andres Agudelo",
                "Jorge Uribe",
                "",
                "Mario Vargas",
                "Jorge Mendez")
                .filter(String::isEmpty)
                .count();

        System.out.println(countEmptyNames);

    }
}
