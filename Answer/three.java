import java.util.*;  
class takeCount   
{  
public static void main(String[] args)  
{ 
Scanner x = new Scanner(System.in);  
  
System.out.println("Enter the number of values ");  
int n= x.nextInt();  
System.out.println("Enter the number of values ");   
int k= x.nextInt();  
int c=0;

for(int i=1; i<=n;i++){
		if(i%k==0)
			c++;
	
}
 
System.out.println("Number of elements divisible by "+k+"= " +c);  
}  
}  