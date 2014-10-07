public class Tester
{
   public static void main ( String[] args )
   {
      String[] food = 	{"Apple", "Banana", "Carrot", "Drum stick",
                          "Eclair", "Flan", "Grape", "Hash browns",
                          "Ice cream", "Jicama", "Kiwi fruit", "Lettuce",
                          "Mango", "New potatoes", "Olives", "Papaya",
                          "Quiche", "Romaine lettuce", "Steak", "Tomatoes",
                          "Umble pie", "V-8", "Wheat bread", "Xmas cookies",
                          "Yellowtail", "Zwieback" };
								  
      LinkedListA list = new LinkedListA();
     
      for (int x = 0; x < food.length; x++ )
         list.addLast(food[x]);
			
      System.out.println ("After adding " + food.length + " items");
		
      System.out.println(list);
  
      System.out.println("Finished");
		
   }// end main
	
}// end class
