/*
    Look into the API documentation of the Rectangle class and locate the method
    void add(int newx, int newy)
    Read through the method documentation. Then determine the result of the following statements:
    Rectangle box = new Rectangle(5, 10, 20, 30);
    box.add(0, 0);
    Write a program AddTester that prints the expected and actual location, width, and
    height of box after the call to add.
 */

import java.awt.Rectangle;

public class E06AddTester {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);

        System.out.println("Expected stats: x = 0, y = 0, width = 20, height = 20");
        System.out.println("Result: x = " + box.x + ", y = " + box.y + ", width = " + box.getWidth() + ", height = " + box.getHeight());
    }
}
