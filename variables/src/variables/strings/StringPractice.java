package variables.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringPractice {
    public static void main(String[] args) {
        String[] familyNames = {"Juan", "Maria", "Karolyn"};
        System.out.println(namesTransform(familyNames));
    }

    public static String namesTransform(String[] names){

        return Arrays.stream(names).map(name -> name
                .substring(1,2).toUpperCase()
                .concat(".")
                .concat(name.substring(name.length() - 2)))
                .collect(Collectors.joining("_"));

    }
}
