package Basic;
import java.io.*;
import java.util.Scanner;

public class operation {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter two Integers");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int sum=math(a,b);
	 int mul=mul(a,b);
	 int sub=sub(a,b);
	 int div=div(a,b);
	 System.out.println("Basic mathematics operation on entered numbers are as below");
	 System.out.println("Addition of two numbers is " +sum);
	 System.out.println("Subtraction of two numbers is" +sub);
	 System.out.println("Multiplication of two numbers is" +mul);
	 System.out.println("Qutionshant part of two numbers after dividing is " +div);
	}
	
	static int math(int x,int y) 
	{
	 return x+y;

	}
	static int sub(int x,int y) 
	{
	 return x-y;

	}
	static int mul(int x,int y) 
	{
	 return x*y;

	}
	static int div(int x,int y) 
	{
	 return x/y;

	}
}
