public class CommonStock extends Stock
{
	public CommonStock(String s, int sh, double p)
	{
		super(s, sh, p);
	}// end constructor
	
	public double calcDividend()
	{
		return 0;
		
	}// end calcDividend
	
	public String toString()
	{
		return super.toString() + "Dividend: " + calcDividend();
	}// end toString
	
}// end class