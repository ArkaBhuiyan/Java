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
public class Swing1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name= JOptionPane.showInputDialog("whats your name?");
        String input= JOptionPane.showInputDialog("how old are you?");
         int age=Integer.parseInt(input);
         System.out.println("Hello"+name);
         System.out.println("Next year you will be"+age+1);       
              
    }
    
}
