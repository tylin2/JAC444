package ca.senecacollege.sync;

public class BadLock {

	public static void main(String[] args) {
		final String r1 = "Some Name";
		final String r2 = "Other Name";
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized(r1) {
					System.out.println(Thread.currentThread().getName() + " locked resources by 1");
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					
					synchronized(r2){
						System.out.println(Thread.currentThread().getName() + " locked resources by 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized(r2) {
					System.out.println(Thread.currentThread().getName() + " locked resources by 2");
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					
					synchronized(r1){
						System.out.println(Thread.currentThread().getName() + " locked resources by 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
