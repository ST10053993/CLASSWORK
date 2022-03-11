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

        //declaring variable using int and changing the value during program
        int x = 5;
        x = 6;
        System.out.println(x);

        //declaring another variable using int
        int myAge = 19;
        //printing myAge variable
        System.out.println("I am " + myAge + " years old");

        final int MAX = 10;
        //printing final int variable
        System.out.println("Final answer is " + MAX);

        //string with my name
        String name = "Yache";

        //character with any character
        char y = 'Y';

        //boolean
        boolean yes = true;

        //double
        double a = 6.8;

        System.out.println("First Java applicaion");
        
        //printing name variable
        System.out.println("My name is " + name);

        //printing char variable
        System.out.println("The character is " + y);

        //printing boolean variable
        System.out.println("The answer is " + yes);

        //printing double variable
        System.out.println("The decimal is " + a);
        //print name and surname using print()
        System.out.print("Yache \n");
        System.out.print("Perumal \n");
        System.out.println();
        
        //print name and surname using println()
        System.out.println("Yache");
        System.out.println("Perumal");
        
        System.out.println("First java app");

        JOptionPane.showMessageDialog(null, "First Java Dialog");

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
