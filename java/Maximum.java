/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/
import java.util.Scanner;
class maximum
{
    public static void main(String args [])
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the count of the numbers: ");
            int i = input.nextInt();
            int A []=new int [i];
            System.out.println("Enter the all numbers: ");
            for(int j=0;j<i;j++)
            {
                int k = input.nextInt();
                A[j]=k;
            }
            int max=A[0];
            for(int j=1;j<i;j++)
            {
                if(A[j]>max)
                    max=A[j];
            }
            System.out.println("The maxium of given numbers : "+max);
        }
    }
}