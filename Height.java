//Read height in centimeter and print appropriate message as per the following condition.
// height greater than 165 cm ----> Taller
//otherwise Shorter

import java.util.*;
public class Height
{
	public static void main(String[] args)
	{
		int h;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height:");
		h = sc.nextInt();

		if(h >= 165)
		{
			System.out.println("Taller....");
		}
		else
		{
			System.out.println("Shorter....");
		}
	}

}
