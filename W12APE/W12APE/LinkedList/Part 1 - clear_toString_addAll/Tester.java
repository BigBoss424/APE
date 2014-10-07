public class Tester
{
   public static void main ( String[] args )
   {
      Integer [] values  = {  0,  10,  20,  30,  40,  50,  60,  70,  80,  90};
		
		Integer [] values1 = {100, 110, 120, 130, 140, 150, 160, 170, 180, 190};
		
		Integer [] values2 = {200, 210, 220, 230, 240, 250, 260, 270, 280, 290};
     								  
      LinkedList list = new LinkedList();
    
	 	// Add to the list
		if(list.addAll(values))
		{
			// Print out number added
	      System.out.println ("After adding " + values.length + " items via addAll()");
			System.out.println();
									  
			// Print out the list	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
		}// end if
		
		else
		{
			System.out.println("List not modified");	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
		}// end else
		
		// Add to the list
		if(list.addAll(values1))
		{
			// Print out number added
	      System.out.println ("After adding " + values1.length + " items via addAll()");
			System.out.println();
									  
			// Print out the list	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
		}// end if
		
		else
		{
			System.out.println("List not modified");	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
		}// end else

		
		// Clear the list
      list.clear();
		
		// Print out empty list
		System.out.println("Call toString() on an empty list:  ");
		System.out.println(list);
		System.out.println();
		
		// Add to the list
		if(list.addAll(values2))
		{
			// Print out number added
	      System.out.println ("After adding " + values2.length + " items via addAll()");
			System.out.println();
									  
			// Print out the list	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
			
		}// end if
		
		else
		{
			System.out.println("List not modified");	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
		}// end else
		
		Integer [] empty = new Integer[0];
		
		if(list.addAll(empty))
		{
			// Print out number added
	      System.out.println ("After adding " + values2.length + " items via addAll()");
			System.out.println();
									  
			// Print out the list	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
			
		}// end if
		
		else
		{
			System.out.println("--List not modified--");	
			System.out.println("Call toString() on a list with " + list.size() + " items");					  
			System.out.println(list); 
			System.out.println();
		}// end else
	
      System.out.println("Finished");
		
   }// end main
	
}// end class
