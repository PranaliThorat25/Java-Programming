// Read age from user and dispay the message as per the given conditions.
// age greater than 18 then allow for voting.
// age less than 18 then not allowed for voting.

import java.util.*;
public class Vote
{
	public static void main(String[] args)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age:");
		age = sc.nextInt();

		if(age >= 18)
		{
			System.out.println("Allowed for Voting...");
		}
		else
		{
			System.out.println("Not Allowed for Voting...");
		}
	}
}
