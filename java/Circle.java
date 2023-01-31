/*
Problem:
Write a Java program to print the area and perimeter of a circle

*/
import java.util.Scanner;
public class Circle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Give the radius of circle in cm:");
		float radius=input.nextFloat();
		//for area
		float area=radius*radius*22/7;
		System.out.println("Area: "+area+"cm^2");
		//for perimeter
		float perimeter=radius*2*22/7;
		System.out.println("Perimeter: "+perimeter+"cm");
	}
}