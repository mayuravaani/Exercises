/*
Problem:
You are given N integers between 1 and 50. Find the count of numbers divisible by K.

Input Format
The input begins with two positive integers N, K. The next N lines contains one positive integer numbers
​
Output Format
Output a single number denoting how many integers are divisible by K.

*/
import java.util.Scanner;
public class DivCount
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Size N" );
		//Size is denoted by N 'integers between 1 and 50'
		int N=input.nextInt();
		//checking N range and sign===>
		if(N<1||N>50)
		{
			System.out.println("Your N is out of range==>");
		}
		else
		{
		int array[]=new int[N];
		int count =0;
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" element:");
			array[i]=input.nextInt();
			if(array[i]<1||array[i]>50)
			{System.out.println("This number is out of range!!=>This program terminate Try again!!!");
			System.exit(0);}
			
		}

		System.out.println("Enter the positive integer K: ");
		int K=input.nextInt();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%K==0)
				count++;
		}
		input.close();
		System.out.println("Number of ineteger divisible by K :="+count);
		}
}}