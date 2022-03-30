package ca.senecacollege.sever2;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerDemo2 {

	public static void main(String[] args) throws IOException {
		
		try(ServerSocket serverSocket = new ServerSocket(5000)){
			
			while(true) {
				
				/*Socket socket = serverSocket.accept();
				ServerEcho se = new ServerEcho(socket);
				se.start();*/
				
				new ServerEcho(serverSocket.accept()).start();
				System.out.println("Client Connected");
			}
			
			
		}

	}

}
