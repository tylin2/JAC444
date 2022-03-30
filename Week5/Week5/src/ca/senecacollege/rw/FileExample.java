package ca.senecacollege.rw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Java uses the concept of Stream to make writing and reading operation work.
 * Stream is simply a link between java program and a source
 * Stream can be of two types:
 * 		Input Stream: used to read the data from the source
 * 		Output Stream: used to write the data to the destination
 * Basic operation of Stream:
 * 		Open a stream
 * 		Read/Write a stream
 * 		Close the stream
 * 
 * */
public class FileExample {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("out.txt");
		File file1 = new File("out.csv");
		
		PrintWriter output = new PrintWriter(file);
		
		output.print("Hello this line one\n");
		output.println("I can write more in this as well");
		output.flush();
		output.close();
		
		Scanner in = new Scanner(file);
		while(in.hasNext()) {
			String data = in.nextLine();
			System.out.println("Data from the file: " + data);
		}
		in.close();
		
		//try-with-resource ---- whic implement the AutoCloseable
		File filen = new File("output.txt");
		try(PrintWriter pw = new PrintWriter(filen);
				Scanner scan = new Scanner(filen))
		{
			pw.print("Line one\n");
			pw.print("Line two\n");
//			NOT WORK!!
//			while(scan.hasNext()) {
//				String d = scan.nextLine();
//				System.out.println(d);
//			}
			
		}
		try(Scanner scan = new Scanner(filen)){
			while(scan.hasNext()) {
				String d = scan.nextLine();
				System.out.println(d);
			}
		}
		
		
	}

}
