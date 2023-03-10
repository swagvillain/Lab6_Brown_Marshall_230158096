/*
This is a program to print a happy face
@author Marshall Brown 230158096
CPSC101 Winter Semester 2023, Lab 6
 */
package lab6q3;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    public MyFrame(){
        setTitle("A Happy Face");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation((EXIT_ON_CLOSE));

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawRect(45, 80, 20, 20);
        g2d.drawRect(105, 80, 20, 20);

    }

}
