package Test;

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

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

        box.translate(50, 25);

        // Construct and draw ellipse
        Ellipse2D.Double ellipse = new Ellipse2D.Double(100, 100, 300, 300);

        // Construct and draw line
        Line2D.Double line = new Line2D.Double(10,10,400,10);
        Point2D.Double start = new Point2D.Double(30, 30);
        Point2D.Double end = new Point2D.Double(500,30);
        Line2D.Double segment = new Line2D.Double(start,end);

        g2.draw(box);
        g2.draw(line);
        g2.draw(segment);
        g2.setColor(Color.BLUE);
        g2.draw(ellipse);
        g2.fill(ellipse);
        g2.setColor(Color.RED);
        g2.drawString("Line", 50, 100);
    }
}
