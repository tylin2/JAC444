package ca.senecacollege.bank;

public class BankAccount implements Runnable {
	private int balance;
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public void run() {
		makeWithDrawal(75);
		if(balance < 0) {
			System.out.println("Money overdrawn...");
		}
		
		
	}
	
	//synchronized make
	private synchronized void makeWithDrawal(int amount) {
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw...");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount);
		} else {
			System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
		}
	}

}
