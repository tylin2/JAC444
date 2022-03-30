package workshop2.tasks;

import workshop2.classes.*;

public class Task1 {
	
	public static void main(String[] args) {
		
		CheckingAccount acc1 = new CheckingAccount(95,0.17);
		SavingsAccount acc2 = new SavingsAccount(300,0.012);
		
		acc1.displayAccInfo();
		System.out.println("");
		acc2.displayAccInfo();
		System.out.println("");
		
		System.out.println("Calculate Interest is: " + acc2.calculateInterest());
		System.out.println("");
		
		acc2.credit(acc2.calculateInterest());
		System.out.println("After remittance: ");
		acc2.displayAccInfo();
		
		
	}
	
}
