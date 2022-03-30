package workshop2.classes;

public class SavingsAccount extends Account {

	private double rate = 0d;
	
	public SavingsAccount(double balance) {
		super(balance);		
	}
	
	public SavingsAccount(double balance, double rate) {
		super(balance);
		this.setRate(rate);
	}	

	public double getRate() {
		return rate;
	}	

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double calculateInterest() {
		return this.getBalance() * this.getRate();	
	}
	
	@Override
	public void displayAccInfo() {
		System.out.println("Saving Account Information: " );
		System.out.println("Balance is: $" + (Math.round(this.getBalance()*100.0)/100.0));
		System.out.println("Interest rate is: " + this.getRate()*100 + "%");		
	}
	

}
