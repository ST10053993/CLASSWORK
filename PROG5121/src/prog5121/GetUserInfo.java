/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog5121;

/**
 *
 * @author ST10053993
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GetUserInfo {

    public static void main(String[] args) {

        //declaring variables
        String name;
        int age;
        int stNum;
        String school;
        String result;
        String today;
        String birthday;

        //dialog box method 1
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "");

        //prompts asking user to input data, takes keyboard inut and outputs the information
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("please enter your name >>");
        name = inputDevice.nextLine();
        System.out.println("please enter your age >>");
        age = inputDevice.nextInt();
        System.out.println("Please enter your student number >>");
        stNum = inputDevice.nextInt();
        System.out.println("Please enter where you study >>");
        inputDevice.nextLine();
        school = inputDevice.nextLine();
        
        //new scanner input method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your rate");
        int rate = input.nextInt();
        
        //new string
        String number = "90";
        int x = Integer.parseInt(number);

        //final print statement
        System.out.println("your name is " + name + " and I am " + age + " years old and my student number is " + stNum + " and my school is " + school + " and my rate is " + rate);
    }

}
