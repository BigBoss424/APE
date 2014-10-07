public class PreferredStock extends Stock
{
	public PreferredStock(String s, int sh, double p)
	{
		super(s, sh, p);
	}// end constructor
	
	public double calcDividend()
	{
		return .01 * shares;
		
	}// end calcDividend
	
	public String toString()
	{
		return super.toString() + "Dividend: " + calcDividend();
	}// end toString
	
}// end class