/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/

import java.util.Scanner;
class Main {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.println("Input the first number: ");
  int n1 = scanner.nextInt();
  System.out.println("Input the second number: ");
  int n2 = scanner.nextInt();

  int sum = n1 + n2;
  int multiply = n1 * n2;
  int subtract = n1 + n2;
  int divide = n1 / n2;
  
  System.out.printf("Addition = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\n ", sum,  multiply, subtract, divide);
  
 }
}
