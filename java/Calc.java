/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/
import java.util.Scanner;
class Calc
{
    public static void main(String args[])
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Type your two numbers : ");
            int i = input.nextInt();
            int j = input.nextInt();
            System.out.println("Sum of given two numbers : "+(i+j));
            System.out.println("Multiply of given two numbers : "+(i*j));
            System.out.println("Subtarction of given two numbers : "+(i-j));
            System.out.println("Division of given two numbers : "+(i/j));
            System.out.println("Reminder of given two numbers : "+(i%j));
        }
    }
}

