package ca.senecacollege.bank;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount t1 = new BankAccount();
		t1.setBalance(100);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t1);
		
		th1.setName("Person 1");
		th2.setName("Person 2");
		
		th1.start();
		th2.start();

	}

}
