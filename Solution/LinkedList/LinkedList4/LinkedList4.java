public class LinkedList4 extends LinkedList3
{
   /* Either report the list to be empty, or use a recursive
      method to print it backwards.
    */
   public void listReverse()
   {
      if (isEmpty()) System.out.println("Empty list");
      reverse(header.next);
   }

   private void reverse(Node curr)
   {  if (curr == null) return;
      reverse(curr.next);
      System.out.println(curr.data);
   }
}