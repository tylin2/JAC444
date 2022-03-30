package ca.senecacollege.rw;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedINPOUT {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filen = "test-in.jpg";
		String fileo = "test-out.jpg";
		
		long startTime, elapsedTime;
		File file = new File(filen);
		
		System.out.println("File size is: " + file.length() + " bytes.");
		
		try(FileInputStream fin = new FileInputStream("test-in.jpg");
				FileOutputStream fout = new FileOutputStream(fileo)){
			startTime = System.nanoTime();
			int eof;
			while((eof = fin.read())!= -1){
				fout.write(eof);
			}
			
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (elapsedTime/1000000.0) + "msec");
			
		}
		
		
		try(BufferedInputStream bfin = new BufferedInputStream(new FileInputStream(filen));
				BufferedOutputStream bfout = new BufferedOutputStream(new FileOutputStream(fileo))){
			startTime = System.nanoTime();
			int eof;
			while((eof = bfin.read())!= -1){
				bfout.write(eof);
			}
			
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (elapsedTime/1000000.0) + "msec");
			
		}
	}
	
	//FilterInputStream, and FilterOutputStream
	//DataInputStream and DataOutputStream
	//nio
	//FileReader and FileWriter
	//BufferedReader and BufferedWriter

}
