public class Tester
{
   public static void main (String[] args)
   {
      String[] foodShuffled = {"Grape", "Banana", "Mango", "Eclair",
                          		"Zwieback", "Ice cream", "Lettuce", "Carrot",
                          		"Apple", "Drum stick", "Umble pie", "New potatoes",
                          		"Wheat bread", "Romaine lettuce", "Flan", "Tomatoes",
                          		"Kiwi fruit", "Papaya", "Jicama", "Quiche",
                          		"Olives", "V-8", "Steak", "Xmas cookies",
                          		"Hash browns", "Yellowtail"};
     
	   LinkedListB list = new LinkedListB();
     
	  
	  	for (int x = 0; x < foodShuffled.length; x++ )
         list.addLast(foodShuffled[x]);		
			
      System.out.println ("After adding " + foodShuffled.length + " items " +
                          "the list size is " + list.size() );
								  
		System.out.println("Printing the UN-Sorted List");
		System.out.println(list);
								  				  
      list.sort();
		
		System.out.println("Printing the Sorted List");
		System.out.println(list);
		
      System.out.println("Finished");
		
   }// end main
}
