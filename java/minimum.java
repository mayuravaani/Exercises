/*
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

*/

import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int A[] = new int[5];
		for(int i=0; i<A.length; i++){
			A[i] = in.nextInt();
		}
		
		System.out.println();
		
		int min = A[0];
		for(int i=0; i<A.length; i++){
			if(A[i] < min){
				min = A[i];
			}
		}
		System.out.println("Miniment = "+min);
		
	}
}