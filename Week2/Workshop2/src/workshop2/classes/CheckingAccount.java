package workshop2.classes;

public class CheckingAccount extends Account {
	
	private double fee = 0;
	
	public CheckingAccount(double balance) {
		super(balance);		
	}
	
	public CheckingAccount(double balance, double fee) {
		super(balance);
		this.setFee(fee);
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public void credit(double deposit) {
		double amount = deposit - fee;
		this.setBalance(this.getBalance()+amount);
	}
	
	@Override
	public void debit(double withdraw) {
		double amount = withdraw + fee;
		if(amount <= this.getBalance()) {
			this.setBalance(this.getBalance()-amount);
		}
		else {
			System.out.println("Debit amount exceeded account balance.");
		}
	}
	
	@Override
	public void displayAccInfo() {
		System.out.println("Checking Account Information: " );
		System.out.println("Balance is: $" + this.getBalance());
		System.out.println("Fee charged per transaction is: " + this.getFee());		
	}
	

}
