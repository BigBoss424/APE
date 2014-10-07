/*
	Singly Linked List class that employs a dummy head node.
	Write the removeAllOccurrences method at the bottom of
	the class.
	
	Do not modify the code for any other part of the class.

*/

public class LinkedList
{
	//nested Node class
	private class Node
	{
		Object data;
		Node next;
		
		Node(Object data, Node next)
		{
			this.data = data;
			this.next = next;
		
		}//end Node constructor
	
	
	}//end nested Node class
	
	private Node head;
	private int size;
	
	public LinkedList()
	{
		this.head = new Node(null, null); //set up dummy node
		this.size = 0;
	
	}//end default constructor
	
	private void clear()
	{
		this.head.next = null;
		this.size = 0;
	
	}//end clear method
	
	public boolean isEmpty()
	{
		return this.size == 0;
		
	}//end isEmpty
	
	public void addFirst(Object data)
	{
		this.head.next = new Node(data, this.head.next);
		this.size++;
	
	}//end addFirst
	
	@Override
	public String toString()
	{
		String result = "List size is " + this.size + "\r\n";
		
		for (Node cur = this.head.next; cur != null; cur = cur.next)
			result += cur.data + "\r\n";
			
		return result;
	
	}//end toString
	
	//----------------------------------------
	//  YOUR CODE GOES BELOW
	//----------------------------------------
	/*
		Write the removeAllOccurrences method below.  It is passed an Object
		and removes all occurrences of that Object in the list.  The method
		returns true if it successfully deleted at least one occurrence of
		the Object, false otherwise.
		
		9 points possible
	
	*/
	
	public boolean removeAllOccurrences(Object dataToRemove)
	{
				
		return false;
	
	
	}//end removeAllOccurrences
	


}//end class LinkedList