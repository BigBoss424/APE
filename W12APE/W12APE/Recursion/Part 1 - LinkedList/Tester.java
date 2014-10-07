public class Tester
{
   public static void main (String[] args)
   {
      Integer [] ordered = {  0,  10,  20,  30,  40,  50,  60,  70,  80,  90,
								100, 110, 120, 130, 140, 150, 160, 170, 180, 190,
								200, 210, 220, 230, 240, 250, 260, 270, 280, 290 };
																  								    
		LinkedListC list = new LinkedListC();
  
      list.addAll(ordered);
			
      System.out.println ("After adding " + ordered.length + " items " +
                          "the list size is " + list.size() );
     	System.out.println();
		
		System.out.println("Printing List in order");
		System.out.println(list);
		System.out.println();

		
		System.out.println("Printing  every item in the List in Reverse on Filled List");
	   list.subListReverse(0, list.size());
		System.out.println();
      
		System.out.println("Clear the List");
		list.clear();
		System.out.println();
      
		System.out.println("Printing List in Reverse on EMPTY List");
      list.subListReverse(0, 0);
		System.out.println();
		
		list.addAll(ordered);
		
		System.out.println("Printing items 3 to 10 (inclusive) in the List in Reverse");
	   list.subListReverse(3, 10);
		System.out.println();
		
		try
		{
			System.out.println("Printing items 10 to 3 in the List in Reverse -- Should Throw Exception");
	   	list.subListReverse(10, 3);
			System.out.println();
		}// end try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println();

		}// end catch
		
		try
		{
			System.out.println("Printing items 0 to 3 in the List in Reverse -- Should Throw Exception");
	   	list.subListReverse(0, list.size() + 1);
			System.out.println();
		}// end try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println();

		}// end catch
		
		System.out.println("Printing items 19 to 19 (inclusive) in the List in Reverse");
	   list.subListReverse(19, 19);
		System.out.println();
		
		System.out.println("Printing items 0 to 0 (inclusive) in the List in Reverse");
	   list.subListReverse(0, 0);
		System.out.println();
		
		int last = list.size() - 1;
		System.out.println("Printing items " + last + " to " + last + " (inclusive) in the List in Reverse");
	   list.subListReverse(last, last);
		System.out.println();






		
		System.out.println("Finished");
		
   }// end main
	
}// end class
