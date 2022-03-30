package ca.senecacollege.threeTask;

public class PringNumbers implements Runnable{
	
	private int num;
	
	public PringNumbers(int i) {		
		this.num = i;
	}

	@Override
	public void run() {
		for(int i = 0; i < num; i++) {
			System.out.print(" " + i);
		}
		
		
	}
	

}