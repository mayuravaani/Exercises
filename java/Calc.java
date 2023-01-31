/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/
import java.util.Scanner;
class Calc
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
     
       System.out.println("Enter Your Number 1:");
        int number1=input.nextInt();
       System.out.println("Enter Your Number 2:");
        int number2=input.nextInt();
		
       int sum=number1 +number2;
       System.out.println("Sum of the given numbers:"+sum);

       int multiply=number1 * number2;

        System.out.println("Multiple  of the given numbers:"+multiply);

       int subtract = number1 - number2;

        System.out.println("Subtract of the given numbers:"+subtract);

       float divide = number1 /number2;

        System.out.println("Divition of the given numbers:"+divide);

       int reminder = number1 % number2;

        System.out.println("Remainder of the given numbers:"+reminder);

   }
}

