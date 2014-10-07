public class LinkedListC extends LinkedListB
{
   public Comparable remove (int index)
   {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
						
		Node cur = head, prev = null;
		
		
		for(int count = 0; count != index && cur.next != null; count ++)
		{
			prev = cur;
			cur = cur.next;
			
		}// end for
		
		if(prev == null)  // start of list
		{
			head = cur.next;
			size --;
			return cur.data;
		}// end if
		
		else
		{
			prev.next = cur.next;
			size --;
			return cur.data;
		
		}// end else 		
			

   }// end remove
	
}// end class