//Read temperature in celcius and convert it into farhenite.

import java.util.*;
class Temp
{
	public static void main(String [] args)
	{
		float f, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Celcius: ");
		c = sc.nextFloat();
		f= (c*1.8f)+32;
		System.out.println("Converted temperature in Farhenite:"+f);
	}
}
