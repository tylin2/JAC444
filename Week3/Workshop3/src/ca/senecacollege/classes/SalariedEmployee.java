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

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		setWeeklySalary(weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {		
		try {
		    if(weeklySalary >= 0) 
		    	this.weeklySalary = weeklySalary;
		  } catch (Exception e) {
			  System.out.println("Exception: "+ e.getMessage());
		  }
	}	

	@Override
	public double getPaymentAmount() {		
		return this.getWeeklySalary();
	}

	@Override
	public String toString() {
		return super.toString() + "Salary {weekly salary: $" + getWeeklySalary() + " }\nearned: $" + getPaymentAmount();
	}	

}
