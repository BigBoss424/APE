public class LinkedList1 extends LinkedList0
{
/* Return the object at the indicated index.  If the index is invalid,
   print an error message and return null */
   public Object get(int index)
   {  Node curr = header.next;
      if (index < 0 || index >= size)
      {  System.out.printf("%d is invalid in a size %d list\n",
                            index, size);
         return null;      // Your code goes here.
      }
      while (index-- > 0)
         curr = curr.next;
      return curr.data;
   }
}