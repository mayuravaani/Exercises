/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double addition = num1 + num2;
        double multiply = num1 * num2;
        double subtract = num1 - num2;
        double divide = num1 / num2;
        double remainder = num1 % num2;
        
        System.out.println("Sum: " + addition);
        System.out.println("Product: " + multiply);
        System.out.println("Difference: " + subtract);
        System.out.println("Quotient: " + divide);
        System.out.println("Remainder: " + remainder);
    }
}



