/*
Problem:
You are given N integers between 1 and 50. Find the count of numbers divisible by K.

Input Format
The input begins with two positive integers N, K. The next N lines contains one positive integer numbers
​
Output Format
Output a single number denoting how many integers are divisible by K.
*/
import java.io.*;
import java.util.Scanner;
 
class DivCount {
    public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    System.out.print("Enter the N value= ");
    int N=in.nextInt();
    System.out.print("Enter the K value= ");
     int K=in.nextInt();
    int count=0;
    for(int i=1; i<=N; i++){
        if(i%K==0){
            count++;
        }
    }
    System.out.println("Counters are "+count);
    }
}

