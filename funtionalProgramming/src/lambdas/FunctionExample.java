package lambdas;

import lambdas.model.Cat;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, String> function = String::toUpperCase;

        String result = function.apply("Hello lambda functions");

        System.out.println(result);


        Function<String, String> greet = name -> "Hello " + name;

        System.out.println(greet.apply("Juan"));


        BiFunction<String, String, String> biFunction = (name, lastName) -> name.concat(lastName);

        String biFunctionResult = biFunction.apply("Jorge", " Uribe");

        System.out.println(biFunctionResult);

    }
}
