public class Tester
{
   public static void main ( String[] args )
   {
      String[] alpha = {"Apple", "Banana", "Carrot", "Drum stick",
                          "Eclair", "Flan", "Grape", "Hash browns",
                          "Ice cream", "Jicama", "Kiwi fruit", "Lettuce",
                          "Mango", "New potatoes", "Olives", "Papaya",
                          "Quiche", "Romaine lettuce", "Steak", "Tomatoes",
                          "Umble pie", "V-8", "Wheat bread", "Xmas cookies",
                          "Yellowtail", "Zwieback" };
     								  
      LinkedList list = new LinkedList();
    
	 	// Add to the list
	   for (int x = 0; x < alpha.length; x++ )
         list.addFirst(alpha[x]);
			
		// Print out number added
      System.out.println ("After adding " + alpha.length + " items ");
		System.out.println();
								  
		// Print out the list	
		System.out.println("Call on a list with " + list.size() + " items");					  
		System.out.println(list); 
		System.out.println();

		// Clear the list
      list.clear();
		
		// Print out empty list
		System.out.println("Call on an empty list:  ");
		System.out.println(list);
		System.out.println();
		
      System.out.println("Finished");
   }
}
