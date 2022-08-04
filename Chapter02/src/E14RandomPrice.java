/*
    Write a program RandomPrice that prints a random price between $10.00 and $19.95
    every time the program is run
 */

import java.util.Random;

public class E14RandomPrice {

    public static void main(String[] args) {
        System.out.println(randomPrice());
    }

    public static double randomPrice() {
        Random rand = new Random();
        var price = rand.nextDouble(10.00,19.95);

        // truncate
        price = price * Math.pow(10,2);
        price = Math.floor(price);
        price = price / Math.pow(10,2);

        return price;
    }
}
