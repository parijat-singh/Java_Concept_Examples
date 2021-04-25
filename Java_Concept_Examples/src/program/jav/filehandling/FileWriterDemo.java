package program.jav.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
  public static void main(String args[]) throws IOException  {
	
	FileWriter output=null;
    String data = "This is the data in the output file";
    
    try {
      // Step 1: Creates a Writer using FileWriter
      output = new FileWriter("C://Users//Mridul Sharma//Desktop//Simplilearn//FSD_Phase_1//output.txt");
      
      // Step 2: Writes string to the file
      output.write(data);
      System.out.println("Data is written to the file.");

    }
    catch (Exception e) {
      e.getStackTrace();
    }
    finally{
        // Step 3: Closes the writer
        output.close();
    }
 }
}