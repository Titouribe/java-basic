package lambdas;

import lambdas.model.Cat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        /* The consumer interface is a java functional interface that consumes an attribute but returns nothing, a functional
           interface only have one abstract method, can have implemented methods with the reserved word default. */

        Consumer<String> consumer = System.out::print;

        consumer.accept("Hello, lambdas!");

        Consumer<Date> consumerDate = date -> {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(simpleDateFormat.format(date));
        };

        consumerDate.accept(new Date());


        BiConsumer<String, Date> consumerTwoArguments = (name, date) -> {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println("Hello, " + name + " in " + simpleDateFormat.format(new Date()));

        };

        consumerTwoArguments.accept("Jorge", new Date());

        //BiConsumer using method reference

        Cat esben = new Cat();

        BiConsumer<Cat, String> setNameToCat = Cat::setCatName;

        setNameToCat.accept(esben, "Esben");

        System.out.println(esben.getCatName());
    }

}
