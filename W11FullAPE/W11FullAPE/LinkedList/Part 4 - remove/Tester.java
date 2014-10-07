public class Tester
{
   public static void main ( String[] args )
   {
      String[] array	 = {"Apple", "Banana", "Carrot", "Drum stick",
                          "Eclair", "Flan", "Grape", "Hash browns",
                          "Ice cream", "Jicama", "Kiwi fruit", "Lettuce",
                          "Mango", "New potatoes", "Olives", "Papaya",
                          "Quiche", "Romaine lettuce", "Steak", "Tomatoes",
                          "Umble pie", "V-8", "Wheat bread", "Xmas cookies",
                          "Yellowtail", "Zwieback" };
								  
		int index = array.length / 2;
		
      LinkedListC list = new LinkedListC();
		//java.util.LinkedList list = new java.util.LinkedList();
		
      for (int x = 0; x < array.length; x++ )
			list.addLast(array[x]);
			
      System.out.println ("After adding " + array.length + " items " +
                          "the list size is " + list.size());
	  	System.out.println();
								  
		System.out.println ("Attempting to remove " + array[index]);
  	   System.out.println ("Removed " + list.remove(index));
		System.out.println ("The list size is " + list.size());
		System.out.println();
				
		index = 0;
		System.out.println ("Attempting to remove " + array[index]);
      System.out.println ("Removed " + list.remove(index));
		System.out.println ("The list size is " + list.size());
		System.out.println();
		
		index = list.size() - 1;
		System.out.println ("Attempting to remove " + array[array.length - 1]);
      System.out.println ("Removed " + list.remove(index));
		System.out.println ("The list size is " + list.size());
		System.out.println();
		
		
		try
		{
				index = list.size();
				System.out.println ("Attempting to remove index not in the list");
      		System.out.println ("Removed " + list.remove(index));
				System.out.println ("The list size is " + list.size());
				System.out.println();
		}// end try
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Not removed - " + e.getMessage());
			System.out.println();
		}// end catch
		
		try
		{
				index = -1;
				System.out.println ("Attempting to remove index not in the list");
      		System.out.println ("Removed " + list.remove(index));
				System.out.println ("The list size is " + list.size());
				System.out.println();
		}// end try
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Not removed - " + e.getMessage());
			System.out.println();
		}// end catch
		
		list.clear();
		
		try
		{
				index = 0;
				System.out.println ("Attempting to remove on empty list");
      		System.out.println ("Removed " + list.remove(index));
				System.out.println ("The list size is " + list.size());
				System.out.println();
		}// end try
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Not removed - " + e.getMessage());
			System.out.println();
		}// end catch
      
		System.out.println("Finished");
		
   }// end main
	
}// end class
