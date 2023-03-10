/*
This is a program to print my name in blue inside a black rectangle in a JFrame
@author Marshall Brown 230158096
CPSC101 Winter Semester 2023, Lab 6
 */

package lab6q1;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    public void MyPanel(){
        this.setSize(new Dimension(500, 500));

    }

    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawRect(25, 225, 450, 200 );
        g2D.setBackground(new Color (0x0));
    }

}
