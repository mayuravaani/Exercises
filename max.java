import java.util.Scanner;
class maximum
{
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many nubers do you want enter:");
		int n=input.nextInt();
		System.out.println("Enter the numbers:");
		int a[]=new int[n];
		for(int i=0; i<n; i++)
		{
			 a[i]=input.nextInt();
		}
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
			
		}
		System.out.println("Largest element of the array:"+max);
		
	}
	
}