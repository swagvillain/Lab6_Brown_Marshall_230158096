/*
This is a program to print my name in blue inside a black rectangle in a JFrame
@author Marshall Brown 230158096
CPSC101 Winter Semester 2023, Lab 6
 */
package lab6q1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    MyPanel panel;


    public MyFrame(){
        super ("my Name");

        panel = new MyPanel();

        JLabel label = new JLabel("          Marshall Brown");
        this.add(label);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x0000FF));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(15,15);
        setVisible(true);

        this.add(panel);
    }



}
