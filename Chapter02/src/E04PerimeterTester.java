/*
    Write a PerimeterTester program that constructs a Rectangle object and then
    computes and prints its perimeter. Use the getWidth and getHeight methods.
    Also print the expected answer.
 */

import java.awt.Rectangle;

public class E04PerimeterTester {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0,0, 35, 75);

        System.out.println("Expected: 220");
        System.out.println("Result: " + perimeter(rect));
    }

    public static double perimeter(Rectangle box) {
        return (2 * box.getHeight()) + (2 * box.getWidth());
    }
}
