package variables.examples;

public class VariablesExamples {
    public static void main(String[] args) {

        // Create a String(OBJECT) Or reference variable

        String greet = "Hello Java!";

        System.out.println("Greet: " + greet);

        System.out.println("greetToUpperCase = " + greet.toUpperCase());

        //Create a int(Primitive) variable

        int number = 10;

        System.out.println("number = " + number);

        //Create a variable usingn "Var"

        var varNumber = 5;

        //When we use var we have to define and initialize the variable in the same line, if we don´t do it, the IDE marks an error.
        //var varNumberWithoutInit;

        System.out.println("varNumber = " + varNumber);
    }
}
