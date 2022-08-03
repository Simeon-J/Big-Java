import javax.swing.*;

public class E17Hal9000 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name);

        System.out.println();

        String request = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
        System.out.println("Im Sorry " + name + ", I can't let you do that");
    }
}
