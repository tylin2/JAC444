package ca.senecacollege.simplethreads;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run....");
		go();
	}
	
	private void go() {
		System.out.println("Inside go method...");
		another();
	}
	
	private void another() {
		System.out.println("Inside another method...");
	}
}
