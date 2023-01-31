/*
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

*/
public class minimum
{
	public static void main(String args[])
	{
		float x,y;
		x=100f;
		y=112.50f;
		//here x and y are fixed value so we can put any value for  and y
		
		if(x>y)
			System.out.println("Minimum cost path :Second cab service!!");
		else
			System.out.println("Minimum cost path First cab service!");
	}
}