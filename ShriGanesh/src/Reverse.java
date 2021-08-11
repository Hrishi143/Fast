import java.util.*;
import java.io.*;
public class Reverse 
{
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.println("Enter an Integer number");
		int a=io.nextInt();
		int rev=0;
		int r=0;
		int temp=a;
		if(a%10!=0) 
		{
			while(a>0)
			{	
			r=a%10;
			rev=rev*10+r;
			a=a/10;
			}
		}
		else if(a%10==0)
		{
			while(a>=0)
			{	
				r=r%10;
				rev=rev*10+r;
				a=a/10;
				
			}
		}
		System.out.printf("%d", rev);
	}
}
	