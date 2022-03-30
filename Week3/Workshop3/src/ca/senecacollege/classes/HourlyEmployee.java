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

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.setWage(wage);
		this.setHours(hours);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {		
		try {
		    if(wage >= 0) 
		    	this.wage = wage;
		  } catch (Exception e) {
			  System.out.println("Exception: "+ e.getMessage());
		  }
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {		
		try {
		    if(hours >= 0 && hours <= 168) 
		    	this.hours = hours;
		  } catch (Exception e) {
			  System.out.println("Exception: "+ e.getMessage());
		  }
	}	

	@Override
	public String toString() {
		return super.toString() + "Hourly { Wage: $" + getWage() + ", Hours: " + getHours() + " }\nearned: $"
				+ getPaymentAmount();
	}

	@Override
	public double getPaymentAmount() {
		double pay = 0;
		if(this.getHours() <= 40) {
			pay = this.getHours() * this.getWage();
		} else {
			pay = this.getWage() * 40 + this.getWage() * 1.5 * (this.getHours() - 40);
		}
		return pay;
	}	

}
