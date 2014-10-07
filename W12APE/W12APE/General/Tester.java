import java.io.*;
import java.util.Scanner;

/**
 * Exercise in input, output, and exception handling.
 *
 * Fill in the program elements as indicated.
 */
public class Tester
{   
   /**
    * Connect a Scanner object to the file
    * whose name is passed in filename.  If the file
	 * does not exist then prompt the user for a new filename
	 * this function should not stop until the file is open
	 * You must use a try catch to handle the nonexistant file
	 * The function will return the open Scanner
	 */
   
	
	
	
	
	

   /**
    * Properly close fin by checking it and then closing it
    */
   
	
	
	
	
	

   /**
    * Connect fout to the file whose name is passed
    * in filename.  If the open fails, print an error
    * message to the screen and exit the program. This
	 * must be done with a try catch.
	 * The open PrintStream will be returned
    */
   
	
	
	
	
	

   /**
    * Properly close fout by checking it and then closing it
    */
   
	
	
	
	
	

   /**
    * Read from fin until end-of-file is reached
	 *
    * If the file is empty return "File is Empty
    *
    * Otherwise read an entire line from the file and build a String
	 * until the end-of-file is reached. Make sure to include the
	 * carriage return at the end of each line.
	 *
	 * At the end-of-file return the built String
    */
   
	
	
	
	

   /**
    * Write the String received to the PrintStream
	   object passed in.
    */
  
  
  
  
  
   public static void main ( String[] args )
   {
      String[] inputFilenames  = {"filledFile.txt", "emptyFile.txt"};
		String[] outputFilenames  = {"fileRun.txt", "nullTest.txt"};

		String str;
		Scanner fin = null;
		PrintStream fout = null;

      for(int x = 0; x < inputFilenames.length; x++ )
		{
         fin = openInputFile(inputFilenames[x]);
			fout = openOutputFile(outputFilenames[x]);
			
			str = read(fin);
			write(System.out, str);
			write(fout, str);
			
			if(x == inputFilenames.length - 1)
			{
				fin = null;
				fout = null;
			}// end if
				
         closeInputFile(fin);
			closeOutputFile(fout);


		}// end for
		
		// on prompt enter emptyFile.txt
		fin = openInputFile("doesNotExist.txt");
		closeInputFile(fin);
     		
		System.out.println();	
      System.out.println ("Finished");

   }// end main

}// end class