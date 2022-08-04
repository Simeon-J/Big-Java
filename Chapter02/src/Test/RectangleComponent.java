package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class RectangleComponent extends JComponent {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Two Boxes");
        frame.setSize(500, 500);

        Point p = new Point();
        p.x = 600;
        p.y = 100;

        frame.setLocation(p.x,p.y);
        RectangleComponent component =  new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct and draw rectangle
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);

        box.translate(15, 25);

        g2.draw(box);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(100, 100, 300, 300);

        g2.draw(ellipse);
    }
}
