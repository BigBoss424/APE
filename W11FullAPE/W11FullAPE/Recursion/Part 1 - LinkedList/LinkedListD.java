public class LinkedListD extends LinkedListC
{
   // If the list is empty, print the message "The list is empty."
   // Otherwise list all the data fields, one to a line --- IN REVERSE.
   public void listReverse()
   {
      if ( size == 0 )
         System.out.println("The list is empty");
      listReverse(head);
   }// end listReverse

   void listReverse(Node curr)
   {  if ( curr == null )  return;
      listReverse(curr.next);
      System.out.println(curr.data);
   }// end listReverse
}// end class
