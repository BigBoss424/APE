/*
	Tester class for recursive pow method in Power.java.
	See Power.java, the code below, and output.txt for
	how your pow method should behave.
	
	DO NOT MODIFY THE CODE FOR THIS CLASS.

*/

public class Tester
{
	public static void main(String [] args)
	{
		for (int exp = 0; exp < 10; exp++)
			System.out.println(Power.pow(2, exp));
			
		for (int exp = 0; exp > -10; exp--)
			System.out.println(Power.pow(2, exp));
	
	}//end main



}//end class Tester