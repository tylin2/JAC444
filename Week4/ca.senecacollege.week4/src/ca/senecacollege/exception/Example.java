package ca.senecacollege.exception;

//Throwable parent class of all the exception classes
//java.lang, java.io
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two values: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
//		try {
//			int num1 = input.nextInt();
//			int num2 = input.nextInt();
//			System.out.println("The division is " + (num1/num2));
//		} catch (ArithmeticException ex) {
//			System.out.println("Divisor is zero");
//		} catch	(Exception ex) {
//			System.out.println("General got it");
//			ex.printStackTrace();
//		}	
		
		System.out.println("The result is " + division(num1,num2));
		System.out.println("The program continues..");
	}
	
	public static int division(int num1, int num2) throws ArithmeticException {
//		if(num2 == 0) {
//			throw new ArithmeticException("Divior is zero");
//		}
		
		return num1/num2;
	}

}
