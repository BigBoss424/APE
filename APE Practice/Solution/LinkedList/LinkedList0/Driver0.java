public class Driver0
{
   static public void main(String[] args)
   {
      String[] name = {"Fritz","Amy","Babsy","Ajax","Dustmop","Ebony",
                       "Giselle","Dancer","Ebony","Felicia","Badger",
                       "Caligula","Cerberus","Giselle"};
      LinkedList0 list = new LinkedList0();

      for (int k = name.length; k-- > 0; )
         list.addFirst(name[k]);

      System.out.printf("List (%d items)\n", list.size());
      list.listForward();
      list.clear();
      System.out.printf("\nList (%d items)\n", list.size());
      list.listForward();
      System.out.println ("\nFinished with Driver0");
   }
}