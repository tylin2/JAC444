package ca.senecacollege.sever;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			DatagramSocket clientDatagramSocket = new DatagramSocket();
			Scanner scan = new Scanner(System.in);
			String data;
			do {
				System.out.println("Enter the data to be sent: ");
				data = scan.nextLine();
				byte[] clientbuff = data.getBytes();
				DatagramPacket clientPacket = new DatagramPacket(clientbuff, clientbuff.length, address, 5000);
				clientDatagramSocket.send(clientPacket);
			} while (!data.equals("exit"));
			
		} catch(IOException ex) {}

	}

}
