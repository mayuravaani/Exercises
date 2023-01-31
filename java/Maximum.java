/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/
import java.util.Scanner;
public class Maximum
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Give size of the array:");
		int size=input.nextInt();
		int array[]=new int[size];
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
		}
		input.close();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("Maximum: "+max);
	}
}
