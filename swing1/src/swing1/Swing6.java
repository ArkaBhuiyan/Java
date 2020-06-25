/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package swing1;
import javax.swing.*;
/**
 *
 * @author asma
 */
public class Swing6 {
    
    public static void main(String args[])
        {
                JFrame frame = new JFrame("First Swing Program");
                JPanel panel = new JPanel();
                JButton button = new JButton("Hello World");

                frame.setContentPane(panel);
                panel.add(button);

                frame.setSize(500,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               
                frame.setVisible(true);
        }
}
