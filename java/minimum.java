/*
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

*/
import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Type First cab service charge: ");
            int x = input.nextInt();
            System.out.println("Type Second cab service charge: ");
            int y = input.nextInt();
            if(x<y)
                System.out.println("Chef should take first cab service");
            else
                System.out.println("Chef should take second cab service");
        }
    }
}