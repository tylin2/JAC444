package ca.senecacollege.exception;

import java.util.Scanner;

public class MisMatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cinput = true;
		
		do {
			try {
				System.out.println("Enter int values: ");
				int num1 = input.nextInt();
				cinput = false;
			} catch (Exception e) {
				System.out.println("Try again");
				input.nextLine();
			}			
		}while(cinput);
		
	}

}
