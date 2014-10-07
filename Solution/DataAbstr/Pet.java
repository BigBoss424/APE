public abstract class Pet implements Comparable
{
   String name;
   int    wt;

   public Pet (String name, int wt)
   {  this.name = name;  this.wt = wt;  }

   public abstract String toString();

   public int compareTo(Object o)
   {  Pet rt = (Pet) o;
      int diff = name.compareTo(rt.name);

      if (diff == 0)
         diff = wt - rt.wt;
      return diff;
   }
}