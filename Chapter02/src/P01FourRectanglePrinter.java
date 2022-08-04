/*
    Write a program called FourRectanglePrinter that constructs a Rectangle
    object, prints its location by calling System.out.println(box), and then
    translates and prints it three more times, so that, if the rectangles were
    drawn, they would form one large rectangle, as shown at right.
    Your program will not produce a drawing. It will simply print the
    locations of the four rectangles
 */

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class P01FourRectanglePrinter extends JComponent {

    public static void main(String[] args) {

    }

    public void fourRectanglePrinter(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(10,10,50,50);

        System.out.println(box);

        box.translate(50,0);
        System.out.println(box);
        box.translate(0,50);
        System.out.println(box);
        box.translate(-50,0);
        System.out.println(box);
    }
}
