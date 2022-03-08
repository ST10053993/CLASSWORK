/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121;

/**
 *
 * @author ST10053993
 */
public class Day2 {

    public static void data() {
        System.out.println("Data");
        int x = 10;
        //string
        String name = "Yach";
    }

    // mehtod to subtract two numbers
    public static void subtract(int x, int y) {
        int answer = x - y;
        System.out.println("The answer of " + x + " - " + y + " = " + answer);
    }

    //method to add two numbers
    public static void add(int x, int y) {
        int answer = x + y;
        System.out.println("The answer of " + x + " + " + y + " = " + answer);
    }

    //method to divide two numbers
    public static double divide(int x, int y) {
        return (x/y);
    }

    //method to multiply two numbers
    public static void multiply(int x, int y) {
        int answer = x * y;
        System.out.println("The answer of " + x + " * " + y + " = " + answer);
    }
    //method to write words on the screen
    

    //method that takes 3 paramaters or arguments
    public static int Calculation(int a, int b, String name) {
        System.out.println("Entered name is" + name);  //print the name
        return (a + b);     //return method required for a method that returns a value 

    }
}
