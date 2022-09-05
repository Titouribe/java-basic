package streams;

import streams.model.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExampleSingle {
    public static void main(String[] args) {

        User createdUser = Stream.of("Juan Rodriguez",
                        "Andres Agudelo",
                        "Jorge Uribe",
                        "Jose Maria",
                        "Mario Vargas",
                        "Jorge Mendez")
                .map(name -> name.split(" "))
                .map(arrayNames -> new User(arrayNames[0], arrayNames[1]))
                .peek(System.out::println)
                .filter(user -> user.getName().equals("Jorge"))
                .findFirst().orElseThrow(() -> new NullPointerException("User not found."));

        System.out.println(createdUser);
    }
}
