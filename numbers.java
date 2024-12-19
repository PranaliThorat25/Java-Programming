//Read a number from user and display whether it is positive or negative.

import java.util.*;
public class numbers
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number:");
		num = sc.nextInt();
		
		if(num >= 0)
		{
			System.out.println("Number is Positive..");
		}
		else		
		{
			System.out.println("Number is Negative..");
		}
	} 
}
