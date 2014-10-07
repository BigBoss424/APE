import java.util.*;

public class PetDriver
{
   static void fillList ( List<Pet> client )
   {
       String[] name = {"Fritz","Amy","Babsy","Ajax","Dustmop","Ebony",
                        "Giselle","Dancer","Ebony","Felicia","Badger",
                        "Caligula","Cerberus","Giselle"};
       String kind = "dccdddccccdcdd";
       int[]  wt   = {9,7,5,7,4,9,7,7,3,7,2,7,2,9};
       boolean lngHr = true;

       for (int k = 0; k < wt.length; k++)
       {
          client.add(kind.charAt(k)=='d'?new Dog(name[k], wt[k])
             : lngHr ? new LongHair(name[k], wt[k])
                     : new ShortHair(name[k], wt[k]));
          lngHr = !lngHr;
       }
   }

   static public void main (String[] args)
   {
      List<Pet> client = new ArrayList<Pet>();

      fillList(client);
      System.out.println("Original list:");
      for (Pet item : client)
         System.out.println(item);
      Collections.sort(client);
      System.out.println("\nSorted list:");
      for (Pet item : client)
         System.out.println(item);
   }
}