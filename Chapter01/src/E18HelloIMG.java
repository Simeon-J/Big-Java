import javax.swing.*;
import java.net.URL;

public class E18HelloIMG {
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL("C:\\Users\\User\\Pictures\\Saved Pictures\\Sthg OCs\\Suck_The_Cock.png");
        JOptionPane.showMessageDialog(null, "Hello", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
