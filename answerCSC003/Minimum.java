import java.util.Scanner;
class Minimum
{
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many Numbers you add?:");
		int c=input.nextInt();
		System.out.println("Enter the numbers:");
		int arr[]=new int[c];
		for(int i=0; i<c; i++)
		{
			 arr[i]=input.nextInt();
		}
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("Minimum number:"+min);
		
	}
	
}