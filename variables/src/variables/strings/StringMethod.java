package variables.strings;

import java.util.List;

public class StringMethod {
    public static void main(String[] args) {

        String name = "Jorge Uribe";

        System.out.println("name length: " + name.length());

        System.out.println("Name uppercase: " + name.toUpperCase());

        System.out.println("Name lowercase: " + name.toLowerCase());

        System.out.println("Compare Strings for value: " + name.equals("Jorge Uribe"));

        System.out.println("Compare Strings for value ignore case: " + name.equalsIgnoreCase("Jorge Uribe"));

        System.out.println("Compare String using the unicode table: " + name.compareTo("Jorge Uribe"));

        System.out.println("Compare String using the unicode table ignoring case: " + name.compareTo("Juan Uribe"));

        System.out.println("Obtain a character using the indice in the String: " + name.charAt(0) + " is J");

        System.out.println("Obtain a character using the indice in the String: " + name.charAt(4) + " is e");

        System.out.println("Obtain the last character using the length of the String: " + name.charAt(name.length() - 1));

        System.out.println("Obtain a part of the String: " + name.substring(3) + " \"obtain ge Uribe\"");

        System.out.println("Obtain a part of the String: " + name.substring(1, 4) + " \"obtain org\"");

        String longstring = "longstring";

        System.out.println("Replace some characters in a String: " + longstring.replace("g", "t"));

        System.out.println("Return the index of the first occurrence of a char o phrase in a String: " + longstring.indexOf("g"));

        System.out.println("Return the index of the last occurrence of a char o phrase in a String: " + longstring.lastIndexOf("g"));
        // if the String don´t contain the char o phrase indexOF return -1

        System.out.println("Return true or false if a String contain another String: " + longstring.contains("long"));
        //Return true
        System.out.println("Return true or false if a String contain another String: " + longstring.contains("adad"));
        //Return false
        System.out.println("Return true or false if a String start with some String or char: " + longstring.startsWith("lo"));
        //Return true
        System.out.println("Return true or false if a String end with some String or char: " + longstring.endsWith("ing"));
        //Return true

        String stringWithBlankSpaces = " blank ";

        System.out.println("Delete blank spaces at the start of end of the String: " + stringWithBlankSpaces.trim());

        // Convert String to characters Array usin toCharArray() method

        String randomPhrase = "Loremipsumdolorsit";

        char[] randomPhraseArray = randomPhrase.toCharArray();

        for (char character : randomPhraseArray){
            System.out.println(character);
        }

        for (int i = 0; i < randomPhraseArray.length; i++) {
            System.out.println("\n" + randomPhraseArray[i]);
        }

        List.of(randomPhraseArray).forEach(System.out::println);

        // Convert String to Array of Strings or chars using split() method

        String[] stringArray = randomPhrase.split("o");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("\n" + stringArray[i]);
        }
    }
}
