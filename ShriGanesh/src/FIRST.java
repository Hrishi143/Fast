import java.util.Scanner;
import java.io.*;
public class FIRST 
{

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=io.nextInt();
		float b=io.nextFloat();
		if(b==0)
		{
			System.out.println("Division not possible");
		}
		else
		{
			float d=a/b;
			System.out.printf("%f", d);
		}
		
	}

}
