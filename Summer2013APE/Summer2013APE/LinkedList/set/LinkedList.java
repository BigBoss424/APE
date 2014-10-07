/*
	Singly Linked List class that employs a dummy head node.
	Write the set method in the space provided at the bottom of
	the class.
	
	Do not modify any other code for this class.

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
		Write the set method.
		The first data containing node has an index
		of 0, just as with arrays.
		If the index is outside the bounds of the list,
	 	return null.  Otherwise return the data that
	 	existed at the specified index (before it
	 	was replaced by the new data).
		
		8 points possible
	*/
	public Object set(int index, Object newData)
	{
			
		return null;
	
	
	}//end set
	


}//end class LinkedList