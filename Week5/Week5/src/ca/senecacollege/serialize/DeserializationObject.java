package ca.senecacollege.serialize;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationObject {
	
	private static ObjectInputStream input;

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		openFile();
		readRecords();

	}

	private static void openFile() {
		try {
			input = new ObjectInputStream(new FileInputStream("client.ser"));
		} catch(IOException ex) {
			System.err.println("Error opening the file...");
		}
		
	}

	private static void readRecords() throws ClassNotFoundException, IOException {
		System.out.printf("%-15s%-12s%-12s%-10s%n","Account number","First name","Last name","Balance");
		
		try {
			while(true) {
				Account record = (Account) input.readObject();
				System.out.printf("%-15d%-12s%-12s%-10.0f%n",record.getAccNumber(),
						record.getFname(),record.getLname(),record.getBalance());
			}			
		}catch(EOFException ex) {
			System.err.println("End of Records");
		}
		
	}

}
