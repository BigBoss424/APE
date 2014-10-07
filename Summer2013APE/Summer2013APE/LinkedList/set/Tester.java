/*
	Tester for set method of LinkedList class.
	See LinkedList.java, the code below, and output.txt
	for how your set method should behave.
	
	DO NOT MODIFY THE CODE FOR THIS CLASS.

*/

public class Tester
{

	public static void main(String [] args)
	{
		LinkedList list = new LinkedList();
		System.out.println("Starting with an empty list:\r\n" + list);
		Object oldValue;
		
		oldValue = list.set(0, "new Data value");
		System.out.println("Called set on an empty list, oldValue is: " + oldValue);
		System.out.println("List looks like this:\r\n" + list);
		
		//now add three items to list
		list.addFirst(42);
		list.addFirst("stupendous");
		list.addFirst(3.14159);
		System.out.println("Just added three items to list, list looks like:\r\n" + list);
		
		//try a set at one index beyond list indices
		oldValue = list.set(3, "NEW DATA VALUE");
		System.out.println("Called set that's out of range on list, oldValue is: " + oldValue);
		System.out.println("List looks like this:\r\n" + list);
		
		//try a set on first item in list
		oldValue = list.set(0, "NEW DATA VALUE");
		System.out.println("Called set with index of 0, oldValue is: " + oldValue);
		System.out.println("List looks like this:\r\n" + list);
		
		
		//try a set on last item in list
		oldValue = list.set(2, "SECOND NEW DATA VALUE");
		System.out.println("Called set with index of 2, oldValue is: " + oldValue);
		System.out.println("List looks like this:\r\n" + list);
		
		//a set on middle item in list
		oldValue = list.set(1, "THIRD NEW DATA VALUE");
		System.out.println("Called set with index of 1, oldValue is: " + oldValue);
		System.out.println("List looks like this:\r\n" + list);

		//finally, add some more data to list
		list.addFirst("Amazon.ca! What's the website for that?");
		list.addFirst("Nilbog is Goblin spelled backwards!");
		list.addFirst("I have a very bad feeling about this.");
		
		//remove the next to last item
		oldValue = list.set(4, "***FINAL*** NEW DATA VALUE");
		System.out.println("Called set with index of 4, oldValue is: " + oldValue);
		System.out.println("List looks like this:\r\n" + list);
	
	}//end main

}//end class Tester