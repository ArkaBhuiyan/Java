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
public class Swing5 {
    
    JFrame f;  
Swing5(){  
f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);  
          
f.add(b);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
  
public static void main(String[] args) {  
Swing5 ob=new Swing5();  
}  
}
