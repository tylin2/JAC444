import java.io.*; 
public class Quiz5 { 
	public static void main(String[] args) throws IOException { 
		
		try { BufferedReader bf = new BufferedReader(Reader file); 
				BufferedWriter bw = new BufferedWriter("Buff.txt"); 
				String line; 
				while((line = bf.readLine()) != null) { 
					bw.write(line); 
					bw.newLine(); 
					} 
				bw.flush(); 
				} catch(FileNotFoundException fnfe){ 
					
				
}
} 
