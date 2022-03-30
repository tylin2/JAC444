package ca.senecacollege.communication;

public class BankingCommu {

	public static void main(String[] args) {
		Customer cust = new Customer();
		
		new Thread() {
			public void run() {
				try {
					cust.withdraw(1500);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				cust.deposit(1000);
			}
		}.start();

	}

}

class Customer {
	int balance = 1000;
	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("Going to withdra...");
		if(amount < balance) {
			balance -= amount;
			System.out.println("Withdraw is complete... The new balance is " + balance);
		} else {
			System.out.println("Don't have enough balance... wait for the deposit");
			wait();
			balance -= amount;
			System.out.println("Withdraw is complete... The new balance is " + balance);
		}
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit...");
		balance += amount;
		System.out.println("Deposit is complete... New balance is " + balance);
		notify();
	}
}