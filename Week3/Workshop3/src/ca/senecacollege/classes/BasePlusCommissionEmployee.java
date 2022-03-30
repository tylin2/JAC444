/**********************************************
Workshop 3
Course:JAV444 - Winter
Last Name:Ting-Yeh
First Name:Lin
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/2/11
**********************************************/
package ca.senecacollege.classes;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalay;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalay) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.setBaseSalay(baseSalay);
	}
	
	public double getBaseSalay() {
		return baseSalay;
	}
	
	public void setBaseSalay(double baseSalay) {		
		try {
		    if(baseSalay >= 0) 
		    	this.baseSalay = baseSalay;
		  } catch (Exception e) {
			  System.out.println("Exception: "+ e.getMessage());
		  }
	}	

	@Override
	public String toString() {
		return "Employee:¡@" + getFirstName() + " " + getLastName()
				+ "; SSN: " + getSocialSecurityNumber() + "; "
				+ "BasePlusCommission { Base Salay: $" + getBaseSalay() + " }\nearned: $"
				+ getPaymentAmount();
	}

	@Override
	public double getPaymentAmount() {		
		return Math.round((this.getBaseSalay() * 1.1*100.0)/100.0);
	}	

}
