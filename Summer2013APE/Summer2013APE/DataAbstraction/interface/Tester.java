/*
	Based on the code below, write the FishWeightComparator class ONLY.
	Look at FishWeightComparator.java as well as output.txt for
	what you must do.
	
	DO NOT MODIFY THIS CLASS.

*/

import java.util.*;

public class Tester
{
	public static void main(String [] args)
	{
		ArrayList<Fish> fishList = new ArrayList<Fish>();
		fishList.add(new Fish("trout", 10));
		fishList.add(new Fish("trout", 5));
		fishList.add(new Fish("trout", 15));
		fishList.add(new Fish("salmon", 10));
		fishList.add(new Fish("salmon", 30));
		fishList.add(new Fish("barracuda", 50));
		fishList.add(new Fish("sunfish", 5));
		
		System.out.println("List of fish is as follows:\r\n");
		for(Fish fish: fishList)
			System.out.println(fish);
		
		//Test name comparator	
		Collections.sort(fishList, new FishNameComparator());
		System.out.println("\r\nList of fish after sorting by *NAME* only using class implementing Comparator:\r\n");
		for(Fish fish: fishList)
			System.out.println(fish);
		
		//reset the list to its original state
		fishList = new ArrayList<Fish>();
		fishList.add(new Fish("trout", 10));
		fishList.add(new Fish("trout", 5));
		fishList.add(new Fish("trout", 15));
		fishList.add(new Fish("salmon", 10));
		fishList.add(new Fish("salmon", 30));
		fishList.add(new Fish("barracuda", 50));
		fishList.add(new Fish("sunfish", 5));

		
		//Now test weight comparator	
		Collections.sort(fishList, new FishWeightComparator());
		System.out.println("\r\nList of fish after sorting by *WEIGHT* only using class implementing Comparator:\r\n");
		for(Fish fish: fishList)
			System.out.println(fish);	
			
			
	}//end main method

}//end class Tester