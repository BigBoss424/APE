/*
	Tester for recursive hanoi method you must write in Hanoi.java.
	See Hanoi.java, the bottom of this code, and output.txt for
	details on how your hanoi method should behave.
	
	DO NOT MODIFY THE CODE FOR THIS FILE.

*/

public class Tester
{


	public static void main(String [] args)
	{
		System.out.println("Testing with one disk, moving it from A to C");
		Hanoi.hanoi(1, 'A', 'C', 'B');
		System.out.println("\r\nTesting with two disks, moving them from A to C");
		Hanoi.hanoi(2, 'A', 'C', 'B');
		System.out.println("\r\nTesting with three disks, moving them from A to C");
		Hanoi.hanoi(3, 'A', 'C', 'B');
		
	}

}//end class Tester