package ca.senecacollege.lambdas;

import java.util.Scanner;

public class TestParam {

	public static void main(String[] args) {
		//LambdaExample ob = (num) -> {return num * num;};
		LambdaExample ob = (num) ->  num * num;
		System.out.println("The mutiplication of two number is: " + ob.comp(2));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int input = scan.nextInt();
		
		System.out.println("The subtraction of number is:¡@" + 
							comp((value) -> (input - 20), input));
		
		System.out.println("The subtraction of number is:¡@" + 
				comp((value) -> (input + 20), input));

	}

	private static int comp(LambdaExample obj, int i) {
		
		return obj.comp(i);
	}

}
