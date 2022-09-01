package variables.strings;

public class StringImmutability {
    public static void main(String[] args) {

        /* The strings are immutables for that reason when we modify a String, Java create a new String instance
           but the original String still contains the same characters */

        String practice = "This is a string practice";

        String result = practice.concat(" hello");

        System.out.println(practice);

        System.out.println(result == practice);

        String anotherResult = practice.transform(text -> text + " another string");

        System.out.println(practice);
        System.out.println(anotherResult);

        String resultWithReplace = practice.replace("This", "Other");

        System.out.println(practice);
        System.out.println(resultWithReplace);
    }
}
