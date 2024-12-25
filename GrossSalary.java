//Read basic salary from keyboard and calculate gross salary according to following condition.
//if basic_salary >= 20,000 then hra is 12% on basic_salary and da is 10% on basic_salary and pf is 7% on basic_salary.
//Otherwise hra is 8% on basic_salary, da is 6% and pf is Rs.500.
//Formula: [gs = bs+hra+da-pf]

import java.util.*;
public class GrossSalary
{
	public static void main(String[] args)
	{
		float bs, gs, hra, da, pf;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary:");
		bs = sc.nextFloat();

		if(bs >= 20000)
		{
			hra = 0.12f * bs;
			da = 0.1f * bs;
			pf = 0.7f * bs;
		}
		else
		{
			hra = 0.8f * bs;
			da = 0.6f * bs;
			pf = 500;
		}
		gs = bs+hra+da-pf;

		System.out.println("Basic Salary:"+bs);		
		System.out.println("Gross Salary:"+gs);
	}
}
