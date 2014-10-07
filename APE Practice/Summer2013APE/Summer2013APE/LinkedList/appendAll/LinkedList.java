/*
	Singly Linked List class that employs a dummy head node.
	Write the appendAll method in the space provided
	at the bottom of this class.
	
	Do not modify any other parts of the class code.

*/
import java.util.*;

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
		The appendAll method is passed a List (which is an interface --
		see the Java API as necessary for details)
		
		The method should append each item in the List to the end of
		the linked list.  More specifically, each item in the List
		parameter should be added as a Node to the end of the current
		linked list object. 
		
		Update all linked list fields as necessary.
		
		8 points possible
	*/
	public void appendAll(List list)
	{
			
	}//end appendAll
	


}//end class LinkedList