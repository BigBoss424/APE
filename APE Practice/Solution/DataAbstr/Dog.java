public class Dog extends Pet
{
   public Dog(String name, int wt)
   {  super(name,wt);  }

   public String toString()
   {  return String.format("%d lb. dog:  %s", wt, name);  }
}