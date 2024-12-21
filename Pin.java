//Program for pin check/test.
//pin = 1234

import java.util.*;
public class Pin
{
	public static void main(String[] args)
	{
		int pin;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pin:");
		pin = sc.nextInt();

		if(pin >= 1111 && pin <= 9999)
		{
			if(pin == 6699)
			{
				System.out.println("Your Pin is Correct...");
			}
			else
			{
				System.out.println("Invalid Pin... ");
				System.out.println("Please enter correct password...");

			}
		}
	}
}
