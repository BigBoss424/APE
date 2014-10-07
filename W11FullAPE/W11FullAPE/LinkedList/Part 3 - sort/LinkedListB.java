public class LinkedListB extends LinkedListA
{
   // Sort the list 
   public void sort()
   {
      Node cur, prev, searcher;
		
		for(cur = head; cur.next != null; cur = cur.next)
		{
			prev = cur;
			
			for(searcher = cur.next; searcher != null; searcher = searcher.next)
			{
				if(prev.data.compareTo(searcher.data) > 0)
					prev = searcher;			
			}
			
			Comparable temp = cur.data;
			cur.data = prev.data;
			prev.data = temp;		
			
		}// end for

   }// end sort
	
}// end class