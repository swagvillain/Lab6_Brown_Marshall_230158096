package lab6q1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    myPanel panel;


    public MyFrame(){
        super ("My Name");

        panel = new myPanel();

        JLabel label = new JLabel("Marshall Brown");
        this.add(label);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x0000FF));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocation(150,150);
        setVisible(true);

        this.add(panel);
        this.pack();
    }



}
