package variables.strings;

public class StringConcatenation {
    public static void main(String[] args) {

        // concat strings using the + operator, when we use the + operator we create a new instance of the string using
        // the string builder, for that reason use concat() method is more efficient.

        String course = "Java 17";

        String student = "Jorge";

        String phrase = course + " " + student;

        System.out.println("\n" + phrase);

        // concat strings using .concat() String method

        String course2 = "Java 17";

        String student2 = "Jorge";

        String phrase2 = course.concat(" ").concat(student);

        System.out.println("\n" + phrase2);

        // concat Strings with numbers

        String anyText = "practice";

        int firstNumber = 1;

        int secondNumber = 2;

        System.out.println("\n" + anyText + " " + firstNumber + secondNumber);

        System.out.println("\n" + firstNumber + secondNumber + " " + anyText);

        System.out.println("\n" + anyText + " " + (firstNumber + secondNumber));
    }
}
