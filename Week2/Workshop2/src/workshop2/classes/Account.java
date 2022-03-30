package workshop2.classes;

public abstract class Account {
	
	private double balance;	
	
	public Account(double balance) {		
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
		else {
			System.err.println("Initial balance should greater than or equal to 0.");
		}		
	}	
	
	public void credit(double deposit) {
		this.balance += deposit;
	}
	
	public void debit(double withdraw) {
		if(withdraw <= this.balance) {
			this.balance -= withdraw;
		}
		else {
			System.out.println("Debit amount exceeded account balance.");
		}
	}
	
	public abstract void displayAccInfo();

}
