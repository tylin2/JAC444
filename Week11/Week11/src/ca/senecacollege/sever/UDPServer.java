package ca.senecacollege.sever;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(5000);
			while (true) {
				byte[] sbuff = new byte[50];
				DatagramPacket spacket = new DatagramPacket(sbuff, sbuff.length);
				
				//in-to-in connection which mean that some kind of response has to go back.
				socket.receive(spacket);
				System.out.println("Data receiced: " + new String(sbuff, 0, spacket.getLength()));
			}
		} catch(SocketException se) {}
		catch(IOException ex) {}

	}

}
