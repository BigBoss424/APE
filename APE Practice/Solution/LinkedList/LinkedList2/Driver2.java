public class Driver2
{
   static public void main(String[] args)
   {
      String[] name = {"Fritz","Amy","Babsy","Ajax","Dustmop","Ebony",
                       "Giselle","Dancer","Ebony","Felicia","Badger",
                       "Caligula","Cerberus","Giselle"};
      LinkedList2 list = new LinkedList2();

      for (int k = 0; k < name.length; k++ )
         list.addLast(name[k]);

      System.out.printf("List (%d items)\n", list.size());
      list.listForward();

      System.out.println ("\nFinished with Driver2");
   }
}