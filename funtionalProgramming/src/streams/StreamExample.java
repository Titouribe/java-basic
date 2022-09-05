package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //Stream<String> names = Stream.of("Juan", "Jorge", "Andres", "Maria", "Karolyn");

        //names.forEach(name -> System.out.println(name));

        //names.forEach(System.out::println);


        //String[] namesArray = {"Juan", "Jorge", "Andres", "Maria", "Karolyn"};

        //Stream<String> namesStream = Arrays.stream(namesArray);

        //namesStream.forEach(name -> System.out.println(name));

        /* Stream<String> names = Stream.<String>builder()
                .add("Juan")
                .add("Jorge")
                .add("Andres")
                .build();

        names.forEach(System.out::println); */

        List<String> names = new ArrayList<>();
        names.add("Jorge");
        names.add("Juan");
        names.add("Andres");

        //Stream<String> streamNames = names.stream();

        //streamNames.forEach(System.out::println);

        names.stream().forEach(System.out::println);
    }
}
