package variables.strings;

import java.io.StringReader;

public class StringBases {
    public static void main(String[] args) {

        String str = "abc";

        String strUsingNew = new String("abc");

        String strUsingNewTwo = new String("abc");

        String str2 = "abc";

        System.out.println(str == str2);

        System.out.println(str == strUsingNew);

        System.out.println(str.equals(strUsingNew) && str.equals(str));

        System.out.println(strUsingNewTwo == strUsingNew);

        /* When we instantiate a String with the same contents as other String using new we create a new object(reference),
           but if we instantiate a String without the new operator we assign to this new String the same reference of the
           original String, for that reason the first output will be true but the second will be false, if we want to compare
           Strings by the contents we have to use the equals operator, because if we compare using == that compare by the
           memory reference and not by value.*/
    }
}
