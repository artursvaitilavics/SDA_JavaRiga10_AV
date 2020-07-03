package GUI01;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String string1 = JOptionPane.showInputDialog("Enter number One");
        String string2 = JOptionPane.showInputDialog("Enter second number: ");

        JOptionPane.showMessageDialog(null,
                string1, "Arturs", JOptionPane.PLAIN_MESSAGE);
    }

}
