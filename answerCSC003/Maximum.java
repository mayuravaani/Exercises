import java.util.Scanner;
class Maximum
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
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max=arr[i];
			
		}
		System.out.println("maximum number:"+max);
		
	}
	
}