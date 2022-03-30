package ca.senecacollege.threeTask;

public class TestPrints {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread()); 
		//output: Thread[main,5,main] > 1st main is name

		//create tasks
		Runnable tC = new PrintChars('a',50);
		Runnable tN = new PringNumbers(50);
		Runnable tS = new PrintStrings("Hi", 50);
		
		//create threads
		Thread thC = new Thread(tC);
		Thread thN = new Thread(tN);
		Thread thS = new Thread(tS);
		
		thC.setName("Character Thread");
		thN.setName("Number Thread");
		thS.setName("String Thread");
		//start the threads
		//start() is not in the order
		//thC.start();
		// we can not start the same thread twice
		thC.start();
		thN.start();
		thS.start();
		
		thC.setPriority(Thread.MAX_PRIORITY);
		thS.setPriority(Thread.MIN_PRIORITY);
		
		thC.join(5000);
		Thread.currentThread().yield();
		System.out.println(thN.isAlive());
		//run() will be in the order
		//thC.run();
		//thN.run();
		//thS.run();
		

	}

}
