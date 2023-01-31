import java.util.*;  
class taxi   
{  
public static void main(String[] args)  
{ 
Scanner p = new Scanner(System.in);  
  
System.out.println("Enter the taxiOne's value ");  
int x= p.nextInt();  
System.out.println("Enter the taxiTwo's value ");   
int y= p.nextInt();  


if(x>y)
	System.out.println("Cab service two is suaitable"); 
else if(x<y)
		System.out.println("Cab service one is suaitable"); 
else
	System.out.println("Error"); 
}  
}  