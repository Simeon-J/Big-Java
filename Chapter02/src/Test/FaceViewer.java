package Test;

import javax.swing.JFrame;

public class FaceViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame("An Alien Face");
        frame.setSize(150,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FaceComponent component = new FaceComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
