import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerEcho extends Thread {
	private Socket socket;
	
	public ServerEcho(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
			
			while(true) {
				String data = input.readLine();
				System.out.println("Recived Client Input " + data);
				
				if(data.equals("exit"))
					break;
				
				output.println("Echo from Server " + data);
			}			
		} catch(IOException ex) {
			System.out.println("Something went wrong..." + ex.getMessage());
		}		
	}
}
