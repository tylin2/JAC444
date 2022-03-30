package ca.senecacollege.sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnection {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://example.com");
			BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String lines = "";
			
			while (lines != null) {
				lines = input.readLine();
				System.out.println(lines);
			}
		} catch (IOException ex) {}

	}

}
