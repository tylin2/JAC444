package ca.senecacollege.threeTask;

public class PrintStrings implements Runnable {
	
	private String sToPring;
	private int time;
	
	public PrintStrings(String s, int i) {
		this.sToPring = s;
		this.time = i;
	}

	@Override
	public void run() {
		for(int i = 0; i < time; i++) {
			System.out.print(" " + sToPring);
		}
		
		
	}

}
