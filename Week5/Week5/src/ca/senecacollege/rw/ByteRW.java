package ca.senecacollege.rw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

/* FileInputStream
 * 		Used to read data from the file
 * 		Extends InputStream Class
 * 		FileInputStream(String filename) throws fileNotFoundException
 * 		Will not create a new File if the file dose not exist
 * FileOutputStream
 * 		used to write the data to the file
 * 		
 * 
 */

public class ByteRW {
	private static final String filename = "outbyte.txt";
	public static void main(String[] args) throws IOException {
		
		File f1 = new File(filename);
		
		try(FileOutputStream fout = new FileOutputStream(filename,true);
		FileInputStream fin = new FileInputStream(f1);
				PrintWriter pw = new PrintWriter(fout)){
			
			
		
//		for(int i=1; i<=10; i++) {
//			try {
//				fout.write(i);
//				
//				int c;
//				while((c=fin.read()) != -1) {
//					System.out.print(c + " ");
//				}
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//			finally {
//				
//			}
//		}
		
//		RandomAccessFile rando = new RandomAccessFile(f1,"rw");
//		rando.seek(0);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter something to write:¡@");
		String str = s.nextLine();
		//byte[] byteStr = str.getBytes();
		//fout.write(byteStr);
		pw.print(str + "\n");
		pw.flush();
		
		int c;
		while((c=fin.read()) != -1) {
			System.out.print((char)c);
		}
		}	
		
	}

}
