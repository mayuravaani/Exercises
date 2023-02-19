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

public class DivCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        int count = 0;

        System.out.println("Enter " + n + " integers between 1 and 50:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number % k == 0) {
                count++;
            }
        }

        System.out.println("Count of numbers divisible by " + k + ": " + count);
    }
}

