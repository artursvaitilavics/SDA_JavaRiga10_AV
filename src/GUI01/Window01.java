package GUI01;

import java.awt.FlowLayout;
import javax.swing.*;

public class Window01 extends JFrame{

    private JLabel label1;

    public Window01(){
        super("Window01");
        setLayout(new FlowLayout());

        label1 = new JLabel("Showing some stuff texty");
        label1.setToolTipText("such a cool tooltip");
        add(label1);


    }
}
