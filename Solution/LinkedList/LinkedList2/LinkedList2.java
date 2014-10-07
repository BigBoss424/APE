public class LinkedList2 extends LinkedList1
{
/* Add the element at end of the list.  */
   public void addLast(Object element)
   {  // Dummy head node:  empty list is NOT a special case
      Node tail = header;

      while (tail.next != null)
         tail = tail.next;
      tail.next = new Node(element);
      size++;
   }
}