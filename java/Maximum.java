/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maximum = numbers[0];
        for (int i = 1; i < length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Maximum number: " + maximum);
    }
}
