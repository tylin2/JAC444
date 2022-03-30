package ca.senecacollege.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileObjectInOut {
	
	private static ObjectOutputStream output;
	public static void main(String[] args) {
		openFile();
		addRecords();

	}
	public static void openFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("Client.ser"));
		} catch (IOException ex) {
			System.err.println("Error opening the file...");
		}
	}
	
	public static void addRecords() {
		Scanner input = new Scanner(System.in);
		System.out.printf("%n%s%s%n? ", "Enter account number, first name, last name, balance", 
				"Enter end-of-file marker");
		while(input.hasNext()) {
			try {
				Account record = new Account(input.nextInt(),
											 input.next(),
											 input.next(),
											 input.nextDouble());
				output.writeObject(record);
			} catch(IOException ex) {
				System.err.println("Error writting the file...");
				ex.printStackTrace();
				break;
			}System.out.println("?- ");
		}
	}

}
