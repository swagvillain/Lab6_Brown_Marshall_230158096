package lab6q1;

import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel{
    public void MyPanel(){
        //this.setPreferredSize(new Dimension(500, 500));

    }

    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawRect(25, 225, 450, 200 );
        g2D.setBackground(new Color (0x0));
    }

}
