public class LinkedList
{
   protected static class Node
   {
      protected Comparable data;
      protected Node next;
		
		protected Node ( Comparable data )
      {
         this.data = data;
         this.next = null;
      }// end constructor


    	protected Node ( Comparable data, Node next )
      {
         this.data = data;
         this.next = next;
      }// end constructor
     		
   }// end Node class

   
   protected Node head;
   protected int  size;
	
	// NOTE:  DUMMY header node.
	public LinkedList()
	{
		this.head = new Node(null);//set up DUMMY
		this.size = 0;
	
	}//end constructor

   // Return the present size of the linked list
   public int size()
   {  
		return size;
	}// end size
	
	/*********************************************************/
	/******** Your Code Goes Below Here **********************/
	/*********************************************************/

   // Empty out the linked list
	
	
	
	
		
	// Appends the specified elements to the end of this list.
	// Returns true if this collection changed as a result of the call.
		
	


	
	
	// Write the toString method.
	// This method returns a string formatted
	// as follows: [first value, second value, ..., last value ]
	// Note that the last value does not have a comma after it.
	// Note also that there is a space after each comma.
	// The method should return 'List is Empty'
	// if the list is empty	
		
	
 }// end LinkedList class