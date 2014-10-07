public class LinkedList3 extends LinkedList2
{
/* Remove the first occurrence of the Object element from the list
   and return boolean true.  If there is no such Node, return false.
 */
   public boolean remove(Object element)
   {  Node prev = header;    // Even the first node has a prev.

      while (prev.next != null && !element.equals(prev.next.data))
         prev = prev.next;
      if (prev.next == null)
         return false;     // Your code goes here
      prev.next = prev.next.next;
      size--;
      return true;
   }
}