/*
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

*/
import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the charges of first cab service: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the charges of second cab service: ");
        double y = scanner.nextDouble();

        double minimum = Math.min(x, y);

        if (minimum == x) {
            System.out.println("Chef should take the first cab service.");
        } else {
            System.out.println("Chef should take the second cab service.");
        }
    }
}
