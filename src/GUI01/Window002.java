package GUI01;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Window002 extends JFrame{
    private JTextField textField01;
    private JTextField textField02;
    private JTextField textField03;
    private JPasswordField passwordField;

    public Window002(){
        super("Window002");
        setLayout(new FlowLayout());

        textField01 = new JTextField(10);
        add(textField01);
        textField02 = new JTextField("enter text here");
        add(textField02);
        textField03 = new JTextField("change this !!! :D");
        textField03.setEditable(false);
        add(textField03);
        passwordField = new JPasswordField("Password");
        add(passwordField);

    }
}
