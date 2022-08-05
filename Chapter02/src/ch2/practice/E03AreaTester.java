/*
    Write an AreaTester program that constructs a Rectangle object and then computes
    and prints its area. Use the getWidth and getHeight methods. Also print the expected
    answer.
 */
package ch2.practice;

import java.awt.Rectangle;

public class E03AreaTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0,0,100,100);

        System.out.println("Expected: 10000");
        System.out.println("Result: " + area(rect));
    }

    public static double area(Rectangle box) {
        return box.getWidth() * box.getHeight();
    }
}
