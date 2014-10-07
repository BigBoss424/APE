import java.io.*;
import java.util.Scanner;

/**
 * Exercise in input, output, and exception handling.
 *
 * Fill in the program elements as indicated.
 */
public class Tester
{
   private static Scanner fin = null;
   private static PrintStream fout;

	//private static BufferedReader inputA;

   /**
    * Connect either fin or inputA to the file
    * whose name is passed in filename.  Return
    * true if the connection succeeds, return false
    * if it does not succeed.  If there is an
	 * exception then you must use a try catch to handle
	 * that exception.
	 */
   private static boolean openInputFile(String filename)
   {
      try
      {
			fin = new Scanner(new File(filename));
		}// end try

      catch (Exception e)
      {
         return false;
      }// end catch

      return true;

   }// end openInputFile


   /**
    * Properly close either fin or inputA.
    */
   private static void closeInputFile()
   {
      fin.close();

   }// end closeFile


   /**
    * Connect fout to the file whose name is passed
    * in filename.  If the open fails, print an error
    * message to the screen and exit the program. This
	 * must be done with a try catch.
    */
   private static void openOutputFile(String filename)
   {
      try
      {
			fout = new PrintStream(filename);
		}// end try

      catch(Exception e)
      {
			System.out.println ("Open failed for " + filename);
         System.exit(-1);
      }// end catch

   }// end openOutputFile


   /**
    * Properly close output
    */
   private static void closeOutputFile()
   {
      fout.close();

   }// end closeOutputFile


   /**
    * Read from fin or inputA (depending on what you opened)
    * until end-of-file is reached
	 *
    * If the file is empty return null.
    *
    * Otherwise read an entire line from the file and build a String
	 * until the end-of-file is reached. Make sure to include the
	 * carriage return at the end of each line.
	 *
	 * At the end-of-file return the built String
    */
   private static String read()
   {
		String temp = "";

      while (fin.hasNext())
		{
			temp += fin.nextLine() + "\r\n";

		}// end while

		if(temp.equals(""))
			return null;

		return temp;

   }// end read


   /**
    * Write the character string received either to the screen or to
	 * the file based on what was passed in.
    */
   private static void writeLine(PrintStream ps, String item )
   {
      ps.println(item);

   }// end writeLine

   public static void main ( String[] args )
   {
      String[] inputFilenames  = {"filledFile.txt", "doesNotExistFile.txt", "emptyFile.txt"};
		String str;

      openOutputFile("outputFile.txt" );

      for(int x = 0; x < inputFilenames.length; x++ )
		{
         if(openInputFile(inputFilenames[x]))
         {
            System.out.println("Connection succeeded to " + inputFilenames[x]);
				System.out.println("\nFile Contents are:\r\n");

				str = read();

				if(str != null)
				{
					writeLine(System.out, str);
					writeLine(fout, str);
				}// end if

				else
					writeLine(System.out, "The file is empty");

            closeInputFile();

         }// end if

         else
 	         System.out.println("Connection failed to " + inputFilenames[x]);

			System.out.println();

		}// end for

      closeOutputFile();
		
		System.out.println();
		
      System.out.println ("Finished");

   }// end main

}// end class