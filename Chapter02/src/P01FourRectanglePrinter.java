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
        JFrame frame = new JFrame("Four Rectangle");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocation(500, 200);

        P01FourRectanglePrinter printer = new P01FourRectanglePrinter();
        frame.add(printer);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(10,10,50,50);

        g2.draw(box);
        boxPrint(box);

        box.translate(50,0);
        g2.draw(box);
        boxPrint(box);

        box.translate(0,50);
        g2.draw(box);
        boxPrint(box);

        box.translate(-50,0);
        g2.draw(box );
        boxPrint(box);
    }

    public static void boxPrint(Rectangle box) {
        System.out.println("X: " + box.x + ", Y: " + box.y + ", Width: " + box.getWidth() + ", Height: " + box.getHeight());
    }
}
