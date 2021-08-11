import java.util.*;
import java.io.*;
public class Prime 
{

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.println("Enter an Integer number");
		int n=io.nextInt();
		int flag=0;
		int temp=n/2;
		int i=2;
		while(i<=temp)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			
			i++;
		}
		if (flag==0)
		{
			System.out.println("The entered number is Prime");
		}
		else
		{
			System.out.println("The entered number is not Prime");
		}

}
}