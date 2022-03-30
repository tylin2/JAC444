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
package ca.senecacollege.testing;

import ca.senecacollege.classes.*;

public class PayrollSystemTest {

	public static void main(String[] args) {

		Employee[] arr = new Employee[4];
		arr[0] = new CommissionEmployee("Jack","Barney","123-123-123", 2500, 0.12);
		arr[1] = new SalariedEmployee("John", "Smith","111-11-1111", 800.00);
		arr[2] = new HourlyEmployee("Cindy","Jobs","222-22-222", 40, 45);
		arr[3] = new BasePlusCommissionEmployee("Lisa","Lin","333-33-333",0,0,100);
		for(int i=0; i<arr.length; i++) {
			System.out.printf(arr[i].toString());			
			System.out.println("");
			System.out.println("");
		}
		System.out.println("");
		for(int i=0; i<arr.length; i++) {
			//Employee: Jack Barney is of class ca.senecacollege.ict.CommissionEmployee
			System.out.println("Employee: " + arr[i].getFirstName() + " " + arr[i].getLastName() 
								+ " " + arr[i].getClass().getName());
		}

	}

}
