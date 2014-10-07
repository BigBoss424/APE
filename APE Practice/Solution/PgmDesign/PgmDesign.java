import java.io.*;            // PrintWriter [and BufferedReader]
import java.util.Scanner;    // In case you use Scanner

/**
 * Exercise in recursion, input, output, sorting, and exception handling.
 *
 * Fill in the program elements as indicated.
 */
public class PgmDesign
{
   static private Scanner        input = null;
   static private PrintWriter    output;

   /**
    * Generate the n'th triangular number:
    * If n is greater than zero, the triangular number
    * for n is n plus the triangular number for (n-1).
    *.Otherwise it is zero.
    *
    * This MUST be done recursively!!!
    */
   static int triangular(int n)
   {
      return n < 1 ? 0 : n + triangular(n-1);
   }

   /**
    * Connect the input to the file whose name is
    * passed in filename.  Return true if the connection
    * succeeds, return false if it does not succeed.
    * This means that you must handle the exception on failure.
    */
   private static boolean connectInput ( String filename )
   {
      try { input = new Scanner(new File(filename));  }
      catch (Exception e)  { return false;  }
      return true;
   }

   /**
    * Properly close input opened in connectInput
    */
   private static void disconnectInput()
   {
      input.close();
   }

   /**
    * Connect output to the file whose name is passed
    * in filename.  If the open fails, print an error
    * message to the console and exit the program.
    */
   private static void connectOutput ( String filename )
   {
      try {  output= new PrintWriter(filename);  }
      catch (Exception e)
      {  System.out.println(e);  System.exit(-1);  }
   }

   /**
    * Properly close output
    */
   private static void disconnectOutput()
   {
      output.close();
   }

   /**
    * Read from input.
    *
    * At end-of-file, return null.
    *
    * Otherwise read an entire line from the file and return
    * that as a character string.
    */
   private static String nextItem()
   {
      return input.hasNext() ? input.nextLine() : null;
   }

   /**
    * Write the character string received both to the PrintWriter
    * named "output" and to the screen so that each string in the
    * file is on a separate line.
    */
   private static void writeLine ( String item )
   {
      System.out.println(item);  output.println(item);
   }

   /**
    * Receive lines from the input until nextItem()
    * returns a null reference.  Place them into the
    * String array passed as a parameter.
    *
    * That String array must be in proper order when you
    * return.  You may either do this as you receive the
    * data, or you may write a sorting method and invoke
    * that after the data have all been read.
    *
    * The value returned by this method is the number of
    * entries in the array.
    */
   private static int readData (String[] data)
   {
      int size = 0;
      String save; // For insertion sort positioning logic

      for (save = nextItem(); save != null; save = nextItem())
      {
         int k = size++;

         // Insert into position logic from insertion sort
         for ( ; k > 0 && save.compareTo(data[k-1]) < 0 ; k-- )
            data[k] = data[k-1];
         data[k] = save;
      }
      return size;
   }

   public static void main ( String[] args )
   {
      String[] input  = {"IOin1.txt", "IOin2.txt"},
               data   = new String[256];
      String   output = "IOout.txt";
      int      j;

      System.out.println("Recursion test:  triangular numbers.");
      for ( j = 0; j < 5; j++ )
         System.out.printf("Triangular(%d) = %d\n", j, triangular(j));

      connectOutput ( output );

      for ( j = 0; j < input.length; j++ )
         if ( connectInput(input[j]) )
         {
            int size = readData(data),
                k;

            System.out.println("Connection succeeded to " + input[j]);
            for ( k = 0; k < size; k++ )
               writeLine(data[k]);
            disconnectInput();
         }
         else
            System.out.println("Connection failed to " + input[j]);
      disconnectOutput();
      System.out.println("Attempting to open WriteProtect.txt for output");
      connectOutput("WriteProtect.txt");
      System.out.println ("connectOutput did NOT process exception.");
   }
}