/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad1;

/**
 *
 * @author lopez
 */
public class Recursividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Version 02: recursividades");

        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Suma de 5: " + suma(5));
        System.out.println("Fibonacci de 5: " + fibonacci(5));
    }

    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}