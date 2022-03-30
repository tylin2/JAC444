package ca.senecacollege.sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import ca.senecacollege.sever2.ServerEcho;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		try(ServerSocket serverSocket = new ServerSocket(5000)){
//			while(true) {
//			Socket socket = serverSocket.accept();
//			System.out.println("Client Connected");
//			
//			//socket.getInputStream and socket.getOutputStream
//			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
//			
//			//while(true) {
//				String data = input.readLine();
//				if(data.equals("exit"))
//					break;
//				output.println("Echo from Server" + data);
//			}
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
