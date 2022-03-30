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

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.setGrossSales(grossSales);
		this.setCommissionRate(commissionRate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {		
		try {
		    if(grossSales >= 0) 
		    	this.grossSales = grossSales;
		  } catch (Exception e) {
			  System.out.println("Exception: "+ e.getMessage());
		  }
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {		
		try {
		    if(commissionRate >= 0 && commissionRate <= 1) 
		    	this.commissionRate = commissionRate;
		  } catch (Exception e) {
			  System.out.println("Exception: "+ e.getMessage());
		  }
	}

	@Override
	public String toString() {
		return super.toString() + "Commission {Gross Sales : " + getGrossSales() + ", Commission Rate: " + getCommissionRate()
				+ " }\nearned: $" + this.getPaymentAmount();
	}

	@Override
	public double getPaymentAmount() {
		double pay = 0;
		pay = this.getGrossSales()*this.getCommissionRate();		
		return pay;
	}	

}
