/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/
import java.util.Scanner;
public class Calc
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your first number:");
		float n1=input.nextFloat();
		System.out.println("Enter your second number:");
		float n2=input.nextFloat();
		System.out.println(n1+"+"+n2+"="+(n1+n2));
		System.out.println(n1+"*"+n2+"="+(n1*n2));
		System.out.println(n1+"-"+n2+"="+(n1-n2));
		System.out.println(n1+"/"+n2+"="+(n1/n2));
		System.out.println(n1+"%"+n2+"="+(n1%n2));
	}
}

