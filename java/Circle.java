/*
Problem:
Write a Java program to print the area and perimeter of a circle

*/
import java.lang.Math.*;

class Circle{
	public static void main(String [] args){
		double radius = 7.0 ;
		double perimeter = 2 * (Math.PI) * radius ;
		double area = Math.PI * radius * radius ;

		System.out.println("The Perimeter of the Circle :" + perimeter);
		System.out.println("The Area of the Circle :" + area);
	}
}