/*
	Tester for appendAll method you must write for Linked List class.
	See LinkedList.java, the code below, and output.txt for
	the proper behavior of the method you must write.
	
	DO NOT MODIFY THIS CLASS.

*/
import java.util.*;

public class Tester
{

	public static void main(String [] args)
	{
		LinkedList list = new LinkedList();
		System.out.println("Starting with an empty list:\r\n" + list);
		
		ArrayList numList = new ArrayList();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		//append to existing list
		list.appendAll(numList);
		System.out.println("List now looks like this:");
		System.out.println(list);
		
		ArrayList stringList = new ArrayList();
		stringList.add("hello");
		stringList.add("goodbye");
		
		//append to existing list
		list.appendAll(stringList);
		System.out.println("List now looks like this:");
		System.out.println(list);
		
		//now let's create an empty list and pass that
		ArrayList emptyList = new ArrayList();
		//append to existing list
		list.appendAll(emptyList);
		System.out.println("List now looks like this:");
		System.out.println(list);
	
	}//end main

}//end class Tester