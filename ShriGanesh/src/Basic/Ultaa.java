package Basic;

import java.util.Scanner;
import java.lang.*;
public class Ultaa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int[] a=new int[10];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<n;i++)
        	a[i]=sc.nextInt();
        
        int temp;
        int i=0;
        int j=n-1;
        while(i<=j)
        {
        	temp=a[i];
        	a[i]=a[j];
        	a[j]=temp;
        	i++;
        	j--;
        }
    
	
        System.out.println("Reversed Array is:");
        for(int k=0;k<n;i++)
        	System.out.println(a[k]);
        		 c
 
	}

}
