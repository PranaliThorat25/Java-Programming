//Read integer from user and dispay whether it is odd or even.

import java.util.*;
public class EvenOdd
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number:");
		num = sc.nextInt();

		if(num % 2 == 0)
		{
			System.out.println("Number is Even...");
		}
		else
		{
			System.out.println("Number is Odd...");
		}

	}
}
