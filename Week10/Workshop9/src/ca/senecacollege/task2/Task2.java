/**********************************************
Workshop 9
Course:JAV444 - W
Last Name:Lin
First Name:Ting-Yeh
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/04/02
**********************************************/
package ca.senecacollege.task2;

public class Task2 {
	public static void main(String []args){
		Chopstick chopstick = new Chopstick();
        new  Philosopher("0",chopstick).start();
        new Philosopher("1",chopstick).start();
        new Philosopher("2",chopstick).start();
        new Philosopher("3",chopstick).start();
        new Philosopher("4",chopstick).start();
    }

}

class Philosopher extends Thread{
	
	private String name;
    private Chopstick chopstick;
    
    public Philosopher(String name,Chopstick chopstick){
        super();
        this.name = name;
        this.chopstick = chopstick;
        this.setName(name);
    }
    
    public void run(){
        while(true){
        	thinking(); 
        	chopstick.takeChopstick (); 
        	eating ();
        	chopstick.putChopstick (); 
        }
    }
    
    public void thinking(){
        System.out.println(name + " is Thinking.");
        try {
        	sleep (1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void eating(){
        System.out.println(name + " is Eating.");
        try {
        	sleep (1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Chopstick {
	private boolean[] used={false,false,false,false,false};
	
	 public synchronized void takeChopstick(){
		 String name = Thread.currentThread().getName();		 
		 int i = Integer.parseInt(name);	              
		 while (used [i] || used [(i + 1)% 5]) { 
			 try {
				 wait();	            
			 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		 }
		 used[i]= true;
	     used[(i + 1) % 5] = true;	 
	 }
	 
	 public synchronized void putChopstick(){
		 String name = Thread.currentThread().getName();
	     int i = Integer.parseInt(name);
	 
	     used[i] = false;
	     used[(i + 1) % 5] = false;
	     notifyAll(); 
	 }
}
