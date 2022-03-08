/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makelabels;

/**
 *
 * @author ST10053993
 */
import javax.swing.*;

public class MakeLabels {

    /**
     * @param args the command line arguments
     */
    //Yache                 08/03/2022
    public static void main(String[] args) {

        // TODO code application logic here
        String name, subject;
        // String is the type of variable that is being used in this program
        name = JOptionPane.showInputDialog("Enter the name");
        // name is one of the variables and 'Enter your name' is a dialog prompt
        subject = JOptionPane.showInputDialog("Enter the subject");
        // subject is the other variable and 'Enter your subject' is the other dialog prompt

        System.out.println("****************");
        System.out.println("Name :" + name);
        // Whatevr you input in the 'name' input prompt, that is what the variable will think it is and display
        System.out.println("Subject :" + subject);
        // Whatever you input in the 'subject' input prompt, that is what the variable will think it is and display
        System.out.println("****************");
        //main method 
    }

}
