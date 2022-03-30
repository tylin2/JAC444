/**********************************************
Workshop 2
Course:JAV444 - W
Last Name:Lin
First Name:Ting-Yeh
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/2/4
**********************************************/
package workshop2.tasks;

import java.util.Scanner;

import workshop2.classes.*;

public class Tassk2 {
	
	public static void main(String[] args) {		
		
		System.out.println("User Login...");
		
		Account[] arr = new Account[2];
		arr[0] = new CheckingAccount(95,0.17);
		arr[1] = new SavingsAccount(300,0.001);
		int option = 5;		
		do {
			option = menu();
			System.out.println("");
			switch(option) {
			case 0:				
				break;
			case 1:
				System.out.println("------ Check Account Balance ------");
				check(arr);
				break;
			case 2:
				System.out.println("------ Deposit ------");
				int acc1 = choiceAccount(option);
				if(acc1 != 0) {		
					Scanner input = new Scanner(System.in);
					System.out.print("Enter Your Deposit Amount: ");
					double amount = input.nextDouble();
					if(acc1 == 1) {
						arr[0].credit(amount);
					} else {
						amount += ((SavingsAccount)arr[1]).calculateInterest();
						arr[1].credit(amount);
					}
					check(arr);
				} 
				break;
			case 3:
				System.out.println("------ Withdraw ------");
				int acc2 = choiceAccount(option);
				if(acc2 != 0) {		
					Scanner input = new Scanner(System.in);
					System.out.print("Enter Your Withdraw Amount: ");
					double amount = input.nextDouble();
					if(acc2 == 1) {
						arr[0].debit(amount);;
					} else {
						amount -= ((SavingsAccount)arr[1]).calculateInterest();
						arr[1].debit(amount);;
					}
					check(arr);
				} 			
				break;			
			}			
		} while(option != 0 );
		System.out.println("User Log out...");
		System.exit(0);
	}
	
	public static int menu() {
		int option = 0;
		do {
			System.out.println("");
			System.out.println("------ Main Menu ------");
			System.out.println("1. Check Balances");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");		
			System.out.println("0. Sign off");
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Your Option: ");
			option = input.nextInt();			
			if(option > 3 || option < 0) {				
				System.out.println("Error, please enter again!");				
			}
		} while(option < 0 || option > 3);
		
		return option;
	}
	
	public static void check(Account[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("");
			arr[i].displayAccInfo();			
		}
	}
	
	public static int choiceAccount(int o) {
		int nu = 3;
		do {
			System.out.println("1. Checking Account");
			System.out.println("2. Saving Account");
			System.out.println("0. Cancel");
			Scanner input = new Scanner(System.in);
			if(o == 2) {
				System.out.print("Choose deposit account number: ");
			} else {
				System.out.print("Choose withdraw account number: ");
			}			
			nu = input.nextInt();
			if(nu < 0 || nu > 2) {
				System.out.println("Error, please enter again!");
			}
		} while(nu < 0 || nu > 2);
		return nu;
	}

}
