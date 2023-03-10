/*
This is a program to print my name in blue inside a black rectangle in a JFrame
@author Marshall Brown 230158096
CPSC101 Winter Semester 2023, Lab 6
 */

package lab6q1;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> go()) ;
        System.out.println("started.") ;
    }

    public static void go(){
        MyFrame myFrame = new MyFrame();
        //getContentPane().add(nameComponent);

    }

}

