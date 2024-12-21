//Read 2 numbers from keyboard amd display maximum number from i.

import java.util.*;
public class Max
{
	public static void main(String[] args)
	{
		int a, b;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter two Numbers:");
		a = sc.nextInt(); 
		b = sc.nextInt();
		
		if(a >= b)
		{
			System.out.println("a is Maximum...");
		}
		else
		{
			System.out.println("b is Maximum...");
			
		}
	}
}
