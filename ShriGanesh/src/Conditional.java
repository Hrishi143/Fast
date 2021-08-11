import java.util.*;
import java.io.*;

public class Conditional 
{

	public static void main (String[] args)
	{
		System.out.println("Welcome to Foodies");
		System.out.println("Please select your option");
		System.out.println("1: Upma");
	    System.out.println("2: Dosa");
	    System.out.println("3: Idli");
	    System.out.println("4: Vada");
	    System.out.println("5: Idli Vada");
	    System.out.println("6: Rice");
		Scanner io=new Scanner(System.in);
		int i=io.nextInt();
		switch(i)
		{
		case 0:
			System.out.println("Not selected");
		    break;
		case 1:
			System.out.println("Your order is Upma, which costs Rs30");
			break;
		case 2:
			System.out.println("Your order is Dosa, which costs Rs50");
	        break;	
		case 3:
			System.out.println("Your order is Idli, which costs Rs15");
            break;   		
		case 4:
			System.out.println("Your order is Vada, which costs Rs20");
		    break;
		case 5:
			System.out.println("Your order is Idli Vada, which costs Rs50");
		    break; 
		case 6:
			System.out.println("Your order is Rice, which costs Rs30");
	        break;	
		default:
			System.out.println("Food not available");
		    break;
		    
		
		}
	}
	
}
