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
class DivCount
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter how many numbers want to check and which number going to divide these numbers: ");
            int N = input.nextInt();
            int K = input.nextInt();
            int A [] = new int [N];
            System.out.println("Enter the numbers : ");
            int j=0;
            while(true)
            {
                int i = input.nextInt();
                if(i<1 || i>50)
                    System.out.println("number must be in between 1 and 50,So re enter your number :");
                else
                {
                   A[j]=i;
                   j++;
                }
                if(j>=N)
                    break;
            }
            int count=0;
            for(int i=0;i<N;i++)
            {
                if(A[i]%K==0)
                    count++;
            }
            System.out.println("how many integers are divisible by "+K+" : "+count);
    }
}