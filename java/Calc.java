/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/


import java.util.Scanner;

class Calc{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("First Number                         : ");
		int input1 = input.nextInt();
		
		System.out.print("Operation (\"+\" or \"-\" or \"/\" or \"*\") : ");
		char operation = input.next().charAt(0);
		
		System.out.print("Second Number                        : ");
		int input2 = input.nextInt();
		
		int output = 0;
		int remainder = 0;
		
		if(operation == '+'){
			output = input1 + input2;
		}
		else if(operation == '-'){
			output = input1 - input2;
		}
		else if(operation == '/'){
			output = input1 / input2;
			remainder = input1 % input2;
		}
		else if(operation == '*'){
			output = input1 * input2;
		}
		else{
			System.out.println("unknown operation!!!!!!!!!!!!");
		}
		System.out.println();
		System.out.println("Output                               : "+output);
		if(operation == '/')
			System.out.println("Remainder                            : "+remainder);
	}
	//Calculator...
}