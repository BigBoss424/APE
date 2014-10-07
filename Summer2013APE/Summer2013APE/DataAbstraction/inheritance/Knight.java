/*
	Super class for inheritance hierarchy
	
	DO NOT MODIFY THIS CLASS.
*/

public abstract class Knight
{
	private int braveryIndex; //higher means braver
	private String name;
	
	public String getName()
	{
		return this.name;
	}//end getName
	
	protected Knight(String name, int braveryIndex)
	{
		this.name = name;
		this.braveryIndex = braveryIndex;
	}//end constructor for sub-classes
	
	//this method must be overridden by all concrete sub-classes
	public abstract void attack(String opponentName);
	
	@Override
	public String toString()
	{
		return this.name + " has a bravery index of " + this.braveryIndex;
	
	}//end toString override


}//end class Knight