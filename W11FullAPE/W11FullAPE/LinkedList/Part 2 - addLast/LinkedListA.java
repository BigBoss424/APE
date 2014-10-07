public class LinkedListA extends LinkedList
{
   // Add the "item" to the back of the linked list
   public void addLast ( Comparable item )
   {
      if ( size == 0 )
         addFirst(item);
      else
      {
         Node current = head;
         while ( current.next != null )
            current = current.next;
         current.next = new Node(item);
         size++;
      }// end else
		
   }// end addLast
	
}// end class
