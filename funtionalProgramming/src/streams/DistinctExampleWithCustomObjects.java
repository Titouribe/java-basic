package streams;

import streams.model.User;

import java.util.stream.Stream;

public class DistinctExampleWithCustomObjects {
    public static void main(String[] args) {

        Stream.of("Jorge Uribe",
                "Andres Agudelo",
                "Jorge Uribe",
                "Karolyn Velez",
                "Jorge Uribe",
                "Mario Vargas",
                "Jorge Mendez")
                .map(name -> name.split(" "))
                .map(nameArray -> new User(nameArray[0], nameArray[1]))
                .distinct()
                .forEach(user -> System.out.println(user.getName() + " " + user.getLastName()));

    }
}
