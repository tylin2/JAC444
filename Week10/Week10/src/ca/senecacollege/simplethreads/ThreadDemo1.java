package ca.senecacollege.simplethreads;

import java.util.concurrent.TimeUnit;

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		Task t1 = new Task();
		Thread th = new Thread(t1);
		
		th.start();		
		Thread.sleep(3000);
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Inside main...");

	}

}
