package ca.senecacollege.communication;

import java.util.concurrent.TimeUnit;

public class Noitfier {

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		WaiterClass w1 = new WaiterClass(obj);
		WaiterClass w2 = new WaiterClass(obj);
		WaiterClass w3 = new WaiterClass(obj);
		
		w1.start();
		w2.start();
		w3.start();
		
		TimeUnit.SECONDS.sleep(1);
		synchronized(obj) {
			System.out.println("Main method calls the notify");
			//obj.notify() only one
			obj.notifyAll();
		}
		
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Main method interrupts all the waiting threads");
		
		//w1.interrupt();
		//w2.interrupt();
		//w3.interrupt();

	}

}
