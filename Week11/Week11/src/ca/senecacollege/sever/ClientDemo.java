package ca.senecacollege.sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) throws IOException {
		
		//127.0.0.1
		try(Socket socket = new Socket("localhost",5000)){
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
			
			Scanner scan = new Scanner(System.in);
			String inputString;
			String response;
			do {
				System.out.println("Enter the data to be sent to server: ");
				inputString = scan.nextLine();
				output.println(inputString);
				if(!inputString.equals("exit")) {
					response = input.readLine();
					System.out.println("Resopinse form the Server " + response);					
				}
			} while(!inputString.equals("exit"));
		}
	}

}
