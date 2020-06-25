/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author asma
 */
public class Swing3 {
    public static void main(String[] args)
    {
        Swing31 f = new Swing31();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}

class Swing31 extends JFrame{
    public Swing31(){
        setTitle("rocks");
        setSize(300,200);
        setLocation(200,200);
        
     //   Swing32 panel = new Swing32();
    //    Container cp = getContentPane();
      //  cp.add(panel);
        
    }
}
/*class Swing32 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawString("Hi", 75, 100);
    }
}*/