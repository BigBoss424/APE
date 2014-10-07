public class Tester
{
   public static void main ( String[] args )
   {
      String[] ordered = {"Apple", "Banana", "Carrot", "Drum stick",
                          "Eclair", "Flan", "Grape", "Hash browns",
                          "Ice cream", "Jicama", "Kiwi fruit", "Lettuce",
                          "Mango", "New potatoes", "Olives", "Papaya",
                          "Quiche", "Romaine lettuce", "Steak", "Tomatoes",
                          "Umble pie", "V-8", "Wheat bread", "Xmas cookies",
                          "Yellowtail", "Zwieback" };
      
		LinkedListD list = new LinkedListD();
      
      for (int x = 0; x < ordered.length; x++ )
         list.addLast(ordered[x]);
			
      System.out.println ("After adding " + ordered.length + " items " +
                          "the list size is " + list.size() );
     	System.out.println();
		
		System.out.println("Printing List in order");
		System.out.println(list);
		System.out.println();

		
		System.out.println("Printing List in Reverse on Filled List");
	   list.listReverse();
		System.out.println();
      
		System.out.println("Clear the List");
		list.clear();
		System.out.println();
      
		System.out.println("Printing List in Reverse on EMPTY List");
      list.listReverse();
		System.out.println();
		
      System.out.println("Finished");
		
   }// end main
	
}// end class
