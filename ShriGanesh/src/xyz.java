import java.util.Scanner;
import java.util.*;
import java.io.*;

public class xyz 
{

	public static void main(String[] args)
	 {
		 Scanner io=new Scanner(System.in);
		 System.out.println("Enter the length of the Array");
		 int n=io.nextInt();
		 int temp=0;
		 System.out.println("Enter the Array elements");
		 int [] array=new int[n];
		 for (int i=0;i<n;i++)
		 {
			 array[i]=io.nextInt();
		 }
		 System.out.println("Sorted array is ");
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("");
			 System.out.println(array[i]);
		 }

}
}