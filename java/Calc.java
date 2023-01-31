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
		System.out.print("Type first number: ");
		int x = input.nextInt();
		System.out.print("Type second number: ");
		int y = input.nextInt();
		
		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println(x+"-"+y+"="+(x-y));
		System.out.println(x+"*"+y+"="+(x*y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+"%"+y+"="+(x%y));
	}
}


