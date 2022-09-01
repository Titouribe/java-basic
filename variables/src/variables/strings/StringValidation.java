package variables.strings;

public class StringValidation {
    public static void main(String[] args) {

        //Validation of null Strings

        String practice = null;

        boolean isNull = practice == null;

        System.out.println(isNull);

        // System.out.println(practice + " this String dont throw NullPointerException");
        // System.out.println("This one throws NullPointerException: ".concat(practice));

        /* When we use the .concat() method we reach also the NullPointerException, but if we use the + operator to concat
           the Strings we get a String with the value of the Not null String concat with the word null. */

        if(isNull)
            practice = "default String";

        /* For that reason we need to handle the nullpointer exception when we work with reference variables (Objects)
           using the optional class or with conditionals like if. */

        System.out.println(practice.toUpperCase());
        System.out.println("prevent null pointer with: ".concat(practice));

        /*Validation when String is empty, example "", in this case we can use the .length() property of the String,
          or also we can use the .isEmpty() method that return true if the String is empty. JDK > 6 || JDK < 11 */

        String emptyString = "";

        boolean isEmpty = emptyString.length() == 0;

        if (isEmpty)
            System.out.println("The String is empty");

        if(emptyString.isEmpty())
            System.out.println("The String is empty using the isEmpty() method");

        /* Also we can check if the String is a blank space with the method isBlank() method, but this method also checks
           if the String is empty "" or " ". for that reason is more complete to check Strings. JDK 11+ */

        //String blankString = " ";
        String blankString = "";

        boolean isBlank = blankString == " ";

        boolean isEmptyString = blankString == "";

        if (isBlank)
            System.out.println("The String is blank");
        if (isEmptyString){
            System.out.println("The String is empty");
        }
        if (blankString.isBlank())
            System.out.println("The String is blank or empty using the isBlank() method");
    }
}
