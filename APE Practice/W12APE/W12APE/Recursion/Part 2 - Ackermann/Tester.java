public class Tester
{
   public static void main ( String[] args )
   {
		long theResult;
		
		for(int m = 0; m < 4; m++)
		{
			for(int n = 0; n < 8; n++)
			{
		
				theResult =  Recursion.ackermann(m, n);
			
				System.out.println("The Ackermann number for A(" + m + "," + n + ") is " + theResult + "\r\n");

			}// end for n
			
		}// end for m
      		
   }// end main
		
}// end class

