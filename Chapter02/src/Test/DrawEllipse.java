package Test;

import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawEllipse {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ellipse");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Ellipse2D.Double ellipse = new Ellipse2D.Double(100,100, 400, 400);
    }
}
