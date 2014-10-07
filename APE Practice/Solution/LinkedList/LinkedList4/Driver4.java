public class Driver4
{
   static public void main(String[] args)
   {
      String[] name = {"Ajax","Amy","Babsy","Badger",
                       "Caligula","Cerberus","Dancer",
                       "Dustmop","Ebony","Felicia",
                       "Fritz","Giselle"};
      LinkedList4 list = new LinkedList4();

      for (int k = 0; k < name.length; k++)
          list.addLast(name[k]);
      System.out.println ("Printing in reverse:");
      list.listReverse();
      System.out.println ("\nCalling with empty list:");
      list.clear();
      list.listReverse();
      System.out.println ("\nFinished with Driver4");
   }
}