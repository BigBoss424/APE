public class Cat extends Pet
{
   public Cat(String name, int wt)
   {  super(name,wt);  }

   public String toString()
   {  return String.format("%d lb. cat:  %s", wt, name);  }
}