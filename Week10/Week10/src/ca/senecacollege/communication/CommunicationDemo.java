package ca.senecacollege.communication;

public class CommunicationDemo {

	private static String message;
	public static void main(String[] args) {
		Object obj = new Object();
		
		Thread t1 = new Thread(() -> {
			
			synchronized(obj) {
				while(message == null) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
			System.out.println(message);
		});
		
		Thread t2 = new Thread(()->{
			synchronized(obj) {
				message = "The message has been filled";
				obj.notify();
			}
			
		});
		
		t1.start();
		t2.start();
		

	}

}
