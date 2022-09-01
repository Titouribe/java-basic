package variables.primitives;

import java.util.Scanner;

public class PrimitivesPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String description = scanner.nextLine();

        Double firstPrice = scanner.nextDouble();

        Double secondPrice = scanner.nextDouble();

        System.out.println(calculateTotal(description, firstPrice, secondPrice));

    }

    public static String calculateTotal(String invoiceDescription,
                                        double productOnePrice,
                                        double productTwoPrice){

        double total = productTwoPrice + productOnePrice;

        double tax = total * 0.19;

        return "The invoice " + invoiceDescription + " has a total of: " + total +
                " with a tax of " + tax + " the total amount is: " + (tax + total);
    }
}
