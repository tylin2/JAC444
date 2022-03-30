package ca.senecacollege.communication;

public class WaiterClass extends Thread {
	
	private Object obj;
	public WaiterClass(Object obj) {
		this.obj = obj;
	}
	public void run() {
		synchronized(obj) {
			try{
				System.out.println(this.getName() + " waits");
				obj.wait();
				System.out.println(this.getName() + " ends waiting");
			} catch(InterruptedException ex) {
				System.out.println(this.getName() + " " + ex);
			}
		}
	}

}
