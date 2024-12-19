// Read 3 Numbers from user and display its average.

import java.util.*;
public class Average
{
	public static void main(String[] args)
	{
		int a, b, c;
		float avg;
		System.out.println("Enter 3 Numbers:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		avg = (a+b+c)/3.0f;

		System.out.println("Average="+avg);
		}
}
