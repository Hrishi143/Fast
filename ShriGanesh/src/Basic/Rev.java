package Basic;
import java.io.*;
import java.util.*;
public class Rev {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int[] a=new int[10];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<n;i++)
        	a[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
        	for(int j=i+1;j<n;j++)
        		if(a[i]>a[j])
        		{
        			int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
        		}
               
        
        for(int i=0;i<n;i++)
        	System.out.println(a[i]);
    

	}

}
