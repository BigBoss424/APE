/*
	The Euclidean algorithm is used to efficiently calculate the greatest
	common divisor (Gcd) of two numbers, both greater than 0.

	This algorithm has both an iterative and recursive solution.  
	
	The recursive solution says that for two non-negative numbers a and b,
	the gcd is a,	when b is equal to 0;
	otherwise the gcd is recursively calculated with b and the 
	result of a mod b (the integer remainder of a divided by b).

	Some examples: the Gcd of 6 and 9 is 3, the Gcd of 9 and 10 is 1, the
	Gcd of 20 and 10 is 10.  You should look at the output from this problem
	for further examples (recursion.txt).

	Write the recursive solution to the gcd method based on the
	above algorithm and the	code given below.

	NOTE: If you do not utilize recursion in this problem, you will earn
	0 points.

*/


public class Tester
{
   public static void main ( String[] args )
   {
		int a, b, theGcd;
		
		for (a = 2, b = 30; b > 0; b-=3, a++)
		{
			theGcd = Euclid.gcd(a, b);
			
			System.out.println("The gcd of " + a + " and " + b
		  		  + " is " + theGcd + "\r\n");
		
		}// end for
      		
   }// end main
		
}// end class
