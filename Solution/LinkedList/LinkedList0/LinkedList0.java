public class LinkedList0
{
   /* Nested class, so that LinkedList0 has access to ALL
    * fields within Node
    */
   static protected class Node
   {
      Object data;
      Node   next;

      Node(Object item)
      {  this(item, null);  }

      Node(Object item, Node nxt)
      {  data = item; next = nxt;  }
   }

   Node header;
   int  size;

/* Constructor required to build the dummer header node */
   public LinkedList0()
   {  header = new Node(null);
      header.next = null;
      size = 0;
   }

/* Return the number of entries in the linked list */
   public int size()  {  return size;  }

/* Return true if the list is empty; else return false */
   public boolean isEmpty()
   {
      return size == 0;
   }

/* Turn the linked list into an empty linked list */
   public void clear()
   {
      header.next = null;  size = 0;
   }

/* Add the indicated object to the front of the linked list */
   public void addFirst(Object item)
   {
      header.next = new Node(item, header.next);
      size++;
   }

/* List the contents of the list from front to back.  If the
   list is empty, print a message to that effect.
 */
   public void listForward()
   {  Node curr = header.next;

      if (isEmpty())
         System.out.println("Empty list");
      while (curr != null)
      {  System.out.println(curr.data);  curr = curr.next;  }
   }
}