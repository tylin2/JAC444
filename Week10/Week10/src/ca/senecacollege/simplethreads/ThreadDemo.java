package ca.senecacollege.simplethreads;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		//Thread t1 = new Thread();
		Thread t1 = new ThreadDemo();
		t1.start();
		System.out.println("Inside main..."); // come out first
	}
	
	@Override
	public void run() {
		System.out.println("Inside run....");
		go();
	}
	
	//@Override  <- error
	private void go() {
		System.out.println("Inside go method...");
		another();
	}
	
	private void another() {
		System.out.println("Inside another method...");
	}

}
