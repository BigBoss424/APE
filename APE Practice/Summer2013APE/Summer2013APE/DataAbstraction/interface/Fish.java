/*
	Basic class to represent a Fish.
	
	Do not modify the code for this class!


*/
public class Fish
{
	private String name;
	private int ounceWeight;
	
	public Fish(String name, int weight)
	{
		this.name = name;
		this.ounceWeight = weight;
	
	}//end explicit Fish constructor
	
	public String getName()
	{
		return this.name;
	}//end getName
	
	public int getOunceWeight()
	{
		return this.ounceWeight;
	
	}//end getOunceWeight
	
	@Override
	public String toString()
	{
		return "Fish name: " + this.name + ", weight in ounces: " + this.ounceWeight;
	
	}//end toString



}//end class Fish