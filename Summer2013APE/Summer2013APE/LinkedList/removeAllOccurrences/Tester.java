/*
	Tester for removeAllOccurrences method in LinkedList class.
	See LinkedList.java, the code below, and output.txt for the behavior
	your method should have.
	
	DO NOT MODIFY THIS CLASS.

*/

public class Tester
{

	public static void main(String [] args)
	{
		LinkedList list = new LinkedList();
		System.out.println("Starting with an empty list:\r\n" + list);
		
		//try removing on an empty list
		boolean result = list.removeAllOccurrences(5);
		System.out.println("Remove successful? " + result);
		System.out.println("List looks like this:");
		System.out.println(list);
		
		//now add some things to the list
		list.addFirst(1);
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		System.out.println("List looks like this:");
		System.out.println(list);
		
		//remove something that is not there
		result = list.removeAllOccurrences(5);
		System.out.println("Remove successful? " + result);
		System.out.println("List looks like this:");
		System.out.println(list);
		
		//now remove an item of which there is only 1
		result = list.removeAllOccurrences(3);
		System.out.println("Remove successful? " + result);
		System.out.println("List looks like this:");
		System.out.println(list);
		
		//now remove an item that occurs at the start, finish, and inside list
		result = list.removeAllOccurrences(1);
		System.out.println("Remove successful? " + result);
		System.out.println("List looks like this:");
		System.out.println(list);
		
		//let's get rid of what's left
		result = list.removeAllOccurrences(2);
		System.out.println("Remove successful? " + result);
		System.out.println("List looks like this:");
		System.out.println(list);

		
	}//end main

}//end class Tester