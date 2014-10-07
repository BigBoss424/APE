/*
The recursive solution says that for two non-negative numbers a and b,
the gcd is a,	when b is equal to 0;
otherwise the gcd is recursively calculated with b and the 
result of a mod b.
*/

public class Euclid
{
	public static int gcd(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);

	}// end gcd

}// end class