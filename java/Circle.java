/*
Problem:
Write a Java program to print the area and perimeter of a circle

*/
import java.util.Scanner;
class Circle
{
    public static void main(String args[])
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Type radius: ");
            int r = input.nextInt();
            System.out.println("Area of the circle : "+(22/7)*r*r);
            System.out.println("Perimeter of the circle : "+(2*(22/7)*r));
        }
    }
}