import java.util.*;
import java.io.*;
public class arrays 
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
	 while(n>0)
	 {
		 for (int i=0;i<n;i++)
		 {
			 for (int j=1;j<n;j++)
			 {
				 if(array[i]>array[j])
				 {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				 }
			 
			 }
		 }
	 } 
 
 System.out.println("Sorted array is ");
 for(int i=0;i<n;i++)
 {
	 System.out.println("");
	 System.out.println(array[i]);
 }
 }
}
