import java.util.ArrayList;
import java.util.Collections;

public class Tester
{
   static public void main ( String[] args )
   {
      ArrayList set = new ArrayList(8);
      String[]  s1  = {"MSFT","GOOG","AAPL","HI","COST",
                       "MSFT","MCD", "BA"};
							  
      int[]     s2  = { 48, 97, 59, 33, 89, 33, 33, 78 };
		
		double [] s3  = {28.30, 624.18 ,348.48, 22.37, 72.51, 27.45, 74.06, 70.07};
		
      for ( int x = 0; x < s1.length; x++ )
		{
			if (x % 2 == 0)
				set.add(new CommonStock(s1[x], s2[x], s3[x]));
				
			else
				set.add (new PreferredStock(s1[x], s2[x], s3[x]));
				
		}// end for
		
		System.out.println("Original List");
		
      for ( Object o : set ) // Take advantage of the enhanced for loop
         System.out.println((Stock)o + "\n");
			
      System.out.println("\n");

      Collections.sort(set);

		System.out.println("Sorted List");
      for ( Object o : set ) 
         System.out.println((Stock)o + "\n");

      System.out.println ("Finished");
		
   }// end main
}
