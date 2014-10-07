/*
	Write the sort method for the Sort class in Sort.java.
	See the code below along with output.txt for how
	your sort should behave (fundamentally, it should
	sort the data passed in ascending order).
	
	DO NOT MODIFY THIS FILE.

*/

public class Tester
{
	public static void main(String [] args)
	{
		String [] names4 = {"zippy", "bubba", "sparky", "arnold"};
		String [] names3 = {"zippy", "bubba", "sparky"};
		String [] names2 = {"zippy", "bubba"};
		String [] names1 = {"bubba"};
		String [] names0 = new String[0];
		Integer [] numbers = {23, 0, 45, 0, 91, 99, 2};
		
		//sort 4 names
		System.out.println("Before sorting 4 names:");
		for (String name: names4)
			System.out.println(name);
		Sort.sort(names4);
		System.out.println("\r\nAfter sorting 4 names:");
		for (String name: names4)
			System.out.println(name);
		
		System.out.println("\r\nBefore sorting 3 names:");
		for (String name: names3)
			System.out.println(name);
		Sort.sort(names3);
		System.out.println("\r\nAfter sorting 3 names:");
		for (String name: names3)
			System.out.println(name);
			
		System.out.println("\r\nBefore sorting 2 names:");
		for (String name: names2)
			System.out.println(name);
		Sort.sort(names2);
		System.out.println("\r\nAfter sorting 2 names:");
		for (String name: names2)
			System.out.println(name);
			
		System.out.println("\r\nBefore sorting 1 name:");
		for (String name: names1)
			System.out.println(name);
		Sort.sort(names1);
		System.out.println("\r\nAfter sorting 1 name:");
		for (String name: names1)
			System.out.println(name);
			
		System.out.println("\r\nBefore sorting 0 names:");
		for (String name: names0)
			System.out.println(name);
		Sort.sort(names0);
		System.out.println("\r\nAfter sorting 0 names:");
		for (String name: names0)
			System.out.println(name);
		
		System.out.println("\r\nFinally, let's sort something else - integers");
		for (int num: numbers)
			System.out.println(num);
		Sort.sort(numbers);
		System.out.println("\r\nAfter sorting the integers:");
		for (int num: numbers)
			System.out.println(num);
	
	}//end main


}//end class Tester