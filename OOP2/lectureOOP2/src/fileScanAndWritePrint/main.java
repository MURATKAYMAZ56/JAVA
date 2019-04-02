package fileScanAndWritePrint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException  {
		try {
			File file= new File("src/java.txt");
			if(file.exists() ) { 
			   System.out.println("file is here");
			}
			Scanner sc = new Scanner(file); 
			  
		    while (sc.hasNextLine()) 
		      System.out.println(sc.nextLine()); 

		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		whenWriteStringUsingBufferedWritter_thenCorrect();
		
	  } 
	
	public  static void whenWriteStringUsingBufferedWritter_thenCorrect() 
			  throws IOException {
			    String str = "Hello";
			    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			    writer.write(str);
			     
			    writer.close();
			}

	}
