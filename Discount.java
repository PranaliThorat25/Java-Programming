//Read the following insructions do the task likewise.
//Shopping greater than 1000 then 10% discount.
//Otherwise no discount.

import java.util.*;
public class Discount
{
	public static void main(String[] args)
	{
		float amt, dis;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount:");
		amt = sc.nextFloat();

		if(amt >= 1000)
		{
			dis = amt * 0.1f;
			System.out.println("Discount:"+dis);
		}
		else
		{
			System.out.println("No Discount..");
		}

	}
}
