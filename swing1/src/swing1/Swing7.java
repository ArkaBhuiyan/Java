/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing1;

/**
 *
 * @author asma
 */
import javax.swing.*;
class MyWindow extends JFrame {
	MyWindow(){
		super("First Swing Program");
		setSize(500,500);
                  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
                  JButton button = new JButton("Hello World");
                  setContentPane(panel);
                  panel.add(button);
	}
}

public class Swing7 {
            public static void main(String args[]) {
                MyWindow window = new MyWindow();     
                window.setVisible(true);
        }

    
}
