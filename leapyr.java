//Read year from user and display is it leap year or not.

import java.util.*;
public class leapyr
{
	public static void main(String[] args)
	{
		int yr;
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter Year:");
		yr = sc.nextInt();

		if(yr % 4 == 0)
		{
			System.out.println("Leap Year..");
		}
		else
		{
			System.out.println("Not  Leap Year..");
		}
	}
}
