public class Tester
{
   public static void main ( String[] args )
   {
      Integer [] values  = { 60, 90, 20, 40, 10, 30, 80, 100, 70, 0, 50};
										  
      LinkedListA list = new LinkedListA();
     
      for (int x = 0; x < values.length; x++ )
         list.addOrdered(values[x]);
			
      System.out.println ("After adding " + values.length + " items");
		
      System.out.println(list);
  
      System.out.println("Finished");
		
   }// end main
	
}// end class
