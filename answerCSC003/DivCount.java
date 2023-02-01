import java.util.Scanner;
class DivCount
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("How many Numbers you add?");
		int l=input.nextInt();
		System.out.println("What is your K:");
		int k=input.nextInt();
		 int count=0;
		System.out.println("Enter numbers between 1 and 50:"); 
		for(int i=0; i<l; i++)
		{
			
			int num=input.nextInt();
			if(num%k==0)
				count++;
			
		}
		System.out.println("how many integers are divisible by K :"+count);
		
		
		
		
		
		
			
	}
}