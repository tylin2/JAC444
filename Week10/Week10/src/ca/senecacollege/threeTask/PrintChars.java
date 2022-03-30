package ca.senecacollege.threeTask;

public class PrintChars implements Runnable{
	
	private char charToPring;
	private int time;
	
	public PrintChars(char c, int i) {
		this.charToPring = c;
		this.time = i;
	}

	@Override
	public void run() {
		for(int i = 0; i < time; i++) {
			System.out.print(" " + charToPring);
		}
		
		
	}
	

}
