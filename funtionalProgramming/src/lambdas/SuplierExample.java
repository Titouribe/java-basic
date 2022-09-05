package lambdas;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {

        // Suplier interface is a functional interface that provides a result, for example in this case provide a String

        Supplier<String> greetProvider = () -> "Hello";

        System.out.println(greetProvider.get());
    }
}
