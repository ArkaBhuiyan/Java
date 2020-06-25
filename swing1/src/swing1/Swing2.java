/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author asma
 */
public class Swing2 extends JFrame{
    public static void main(String[] args)
    {
        Swing2 J=new Swing2();
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setSize(1000, 1000);
        J.setVisible(true);
        J.setBackground(Color.yellow);
    }
}
