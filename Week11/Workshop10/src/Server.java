import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) throws IOException {
		try(ServerSocket serverSocket = new ServerSocket(5000)){
			while(true) {
				new ServerEcho(serverSocket.accept()).start();
				System.out.println("Client Connected");
			}
		}

	}

}
