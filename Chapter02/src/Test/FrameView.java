package Test;
import javax.swing.JFrame;

public class FrameView {

    public static void main(String[] args) {
        JFrame empty = new JFrame();
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Blank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
