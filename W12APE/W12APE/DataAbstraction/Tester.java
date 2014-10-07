import java.util.ArrayList;
import java.util.Collections;

public class Tester
{
	public static void main ( String[] args )
   {
		ArrayList students = new ArrayList(6);
		int [] ids = { 123456, 234567, 345678, 456789, 567890, 678901};
		int [] credits = {5, 10, 12, 6, 15, 9};
		
		for(int x = 0; x < ids.length; x++)
		{
			if(x % 2 == 0)
				students.add(new UnderGrad(ids[x], credits[x]));
				
			else
				students.add(new Grad(ids[x], credits[x], 202.50)); 
		
		}// end for
		System.out.println("Original List");

      for ( Object o : students ) // Take advantage of the enhanced for loop
         System.out.println((Student)o + "\r\n");

      System.out.println("\n");

      Collections.sort(students);

		System.out.println("Sorted List by Credits");
      for ( Object o : students )
         System.out.println((Student)o + "\r\n");
			
		Collections.sort(students, new IDSort());

		System.out.println("Sorted List by ID");
      for ( Object o : students )
         System.out.println((Student)o + "\r\n");


      System.out.println ("Finished");


   }// end main
		
}// end class
