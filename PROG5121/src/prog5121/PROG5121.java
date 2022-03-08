/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121;

import javax.swing.JOptionPane;

/**
 *
 * @author ST10053993
 */
public class PROG5121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("First Java applicaion");
        
        JOptionPane.showMessageDialog(null,"First Java Dialog"); 
    
        //Day2.data();
        Day2 d2 = new Day2();
        d2.data();
        d2.add(4, 6);
        d2.subtract(25, 15);
        d2.add(10, 63);
        double answer = d2.divide(10, 2);
        d2.multiply(50, 25);
        
        /*
        block comments
        */

        int variable = d2.Calculation(5, 6, " john");
        System.out.println("The answer for calculation is " + variable);

    }

}
