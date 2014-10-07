public abstract class Student implements Comparable<Student>, StudentInterface
{
	protected int id;
	protected int credits;
	
	public Student(int i, int c)
	{
		this.id = i;
		this.credits = c;
		
	}// end Student
		
	public String toString()
	{
		String str = "";
		
		str += "ID: " + this.id + "\r\n";
		str += "Credits: " + this.credits + "\r\n";
		
		return str;
		
	}// end toString
	
	public int compareTo(Student other)
	{
		int res = this.credits - other.credits;
		if(res != 0)
			return res;
			
		return this.id - other.id;
			
	} // end compareTo
	
	public int getID(){return this.id;}
	public int getCredits() {return this.credits;}

}// end class