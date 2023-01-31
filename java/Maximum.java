/*
Problem:
You are given N integers length array by the user. Find the maximum number

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
		
		int max = A[0];
		
		for(int i=0; i<A.length; i++){
			if(A[i] > max){
				max = A[i];
			}
		}
		System.out.println("Maximent = "+max);
	}
}