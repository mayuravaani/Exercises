import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("How many numbers do you want to enter:");
		int n=input.nextInt();
		System.out.println("Enter the number k:");
		int k=input.nextInt();
		 int count=0;
		System.out.println("Enter the numbers:"); 
		for(int i=0; i<n; i++)
		{
			
			int a=input.nextInt();
			if(a%k==0)
				count++;
			
		}
		System.out.println("numbers divided by k:"+count);
		
		
		
		
		
		
			
	}
}