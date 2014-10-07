/*
	Tester for Knight hierarchy.  You are responsible for
	the BraveKnight class ONLY.  See BraveKnight.java along
	with the code below, Knight.java and the output.txt file
	for what you must do.
	
	DO NOT MODIFY THIS CLASS.
*/

public class Tester
{
	public static void main(String [] args)
	{
		Knight brave = new BraveKnight("Sir Lancelot the Brave");
		System.out.println(brave);
		brave.attack("Peters the Persnickety");
		brave.attack("Steiner the Sinister");
		brave.attack("Kamp the Cantankerous");
		System.out.println(brave);
		
		Knight notSoBrave = new NotSoBraveKnight("Sir Robin, the Not So Brave");
		System.out.println();
		System.out.println(notSoBrave);
		notSoBrave.attack("Armstrong the Avenging");
		notSoBrave.attack("Capaul the Courageous");
		System.out.println(notSoBrave);
		
	
	}//end main

}//end class Tester