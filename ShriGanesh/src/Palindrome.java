import java.util.*;
import java.io.*;
public class Palindrome 
{
  public static void main(String[] args)
  {
	  Scanner io=new Scanner(System.in);
	  System.out.println("Enter an Integer number");
	  int a=io.nextInt();
	  int temp=a;
	  int sum=0;
	  while(a>0)
	  {
		  int r=a%10;
		  sum = sum * 10 +r;
		  a=a/10;
	  }
	if (temp==sum)
	  {
		  System.out.println("Number is Palindrome");
	  }
	 else
	 {
		  System.out.println("Integer is not a Palindrome");
	 } 
	 }
}
