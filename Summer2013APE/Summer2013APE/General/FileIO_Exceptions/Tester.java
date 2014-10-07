import java.io.*;
import java.util.Scanner;

/**
 * Exercise in input, output, and exception handling with files
 * as well as with making sure file objects are ready for use
 * (meaning they are non-null)
 *
 * You will need to write a total of 6 methods:
 * 1) openInputFile: 2 points
 *	2) openOutputFile: 2 points
 * 3) closeInputFile: 2 points
 * 4) closeOutputFile: 2 points
 * 5) read: 5 points
 * 6) writeLine: 2 points
 
 * Each method has been stubbed out for you.
 * Fill in the program elements as indicated above each method.
 * Check the main method at the bottom of the class and the
 * output file (output.txt) for the things that are tested
 * and what should be produced from your code.
 */
public class Tester
{
   private static Scanner fin = null;
   private static PrintStream fout;

   /**
    * Connect fin to the file
    * whose name is passed in the parameter called filename.  
	 * Return true if the connection succeeds, false
    * otherwise.  Use a try/catch to handle any exception
	 * that might occur.
	 */
   private static boolean openInputFile(String filename)
   {
      
      return false;

   }// end openInputFile


   /**
    * Properly close fin if it is not null.
	 * If fin is null,  print the message 
	 * "fin null on call to closeInputFile"
    */
   private static void closeInputFile()
   {
		
   }// end closeFile


   /**
    * Connect fout to the file whose name is passed as a parameter
    * called filename.  If the open fails for any reason, print an error
    * message to the screen and exit the program. This
	 * must be done with a try/catch.
    */
   private static void openOutputFile(String filename)
   {
     
   }// end openOutputFile


   /**
    * Try and close output file. If any kind of exception occurs, handle it and 
	 * print the error message "An exception occurred when closing output file"
	 
	 * NOTE: You must include the error handling functionality specified above
	 *       but it is not tested by this Tester.
    */
   private static void closeOutputFile()
   {
		
   }// end closeOutputFile


   /**
    * Read from fin, provided it is non-null.
	 * If fin is null, return the String "no input file object present on call to read"
	 *
    * Using tools provided by fin (which is a Scanner)
	 * check to see if the current line of data contains (has) an int,
	 * if so, read it in and return an *Integer* object.
	 
	 * If the data is not an integer, check to see if it is a double,
	 * if so, read it in and return a *Double* object from  the method
	 
	 * If the data is not a double, read it in as a String and return
	 * that String object from the method 
    *
	 * NOTE: when reading ints or doubles, Scanner will leave a \n
	 * (whitespace) in the input stream.  This \n may be read the next time
	 * the method is called as an empty String.  This results
	 * in output of that empty string as part of testing as follows:
	 
	 * Data type is String, value is: 
	 
	 * (following the word 'is:' above is an empty string)
	 * The important thing to note is that the above is not an error 
	 * and is not something you need to worry about
   
    */
   private static Object read()
   {
		return "read method not yet properly implemented";

   }// end read


   /**
    * Print the Object received, followed by a newline to fout, provided fout is non null.
	 * If fout is null, print the message "fout null on call to writeLine"
	 */
   private static void writeLine(Object item )
   {
		
   }// end writeLine

   public static void main ( String[] args )
   {
      String[] inputFilenames  = {"filledFile.txt", "doesNotExistFile.txt", "emptyFile.txt"};
		Object data;
		String dataType;
		
		//---check boundary cases
		System.out.println("***Testing some boundary (null) cases for methods\r\n");
		closeInputFile(); //fin is null
		closeOutputFile(); //fout is null
		System.out.println(read()); //fin is null
		writeLine("testing"); //fout is null

      openOutputFile("outputFile.txt" );

		System.out.println("\r\n***Now testing basic functionality");
      for(int x = 0; x < inputFilenames.length; x++ )
		{
         if(openInputFile(inputFilenames[x]))
         {
            System.out.println("\r\n---Connection succeeded to " + inputFilenames[x]);
				System.out.println("\r\nFile Contents are:\r\n");

				while (fin.hasNext())
				{
					data = read();
	
					if(data != null)
					{
						if (data instanceof Double)
							dataType = "Double";
						else if (data instanceof Integer)
							dataType = "Integer";
						else
							dataType = "String";
							
						writeLine("Data type is " + dataType + ", value is: " + data);
						//echo same thing to System.out
						System.out.println("Data type is " + dataType + ", value is: " + data);			
					}// end if
	
					else
					{
						writeLine("No more data in input file");
						System.out.println("No more data in input file");
						
					}
	
            	
				}//end while
				closeInputFile();

         }// end if

         else
 	         System.out.println("!!!Connection failed to " + inputFilenames[x]);

			System.out.println();

		}// end for

      closeOutputFile();
		
		System.out.println();
		
      System.out.println ("Finished testing file I/O");

   }// end main

}// end class