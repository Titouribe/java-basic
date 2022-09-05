package lambdas;

import lambdas.model.Cat;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> predicate = num -> num > 10;

        boolean result = predicate.test(11);

        System.out.println(result);

        Predicate<String> testStringr = month -> month.equals("January");

        boolean result2 = testStringr.test("February");

        System.out.println(result2);


        BiPredicate<Integer, Integer> biPredicate = Integer::equals;

        System.out.println(biPredicate.test(1,1));

        BiPredicate<Cat, Cat> compareInstances = Cat::equals;

        Cat garfieldCat = new Cat();

        Cat silvesterCat = new Cat();

        garfieldCat.setCatName("garfield");

        silvesterCat.setCatName("silvester");

        Cat thirdCat = garfieldCat;

        System.out.println(compareInstances.test(garfieldCat, silvesterCat));

        System.out.println(compareInstances.test(garfieldCat, thirdCat));



    }
}
