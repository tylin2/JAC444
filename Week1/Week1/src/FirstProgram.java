
/* Block comment */
// single line comment
/**
 * This is my first java class,
 * this application will print Hello Wordl on the screen.
 * @author Ting-Yeh Lin
 * @version 1.1
 * 
 */

//
/**
 * Keep the first letter of class's name in capital.
 * Modifier: Private, Public, Protected, Default
 */
//#include <iostream>
import java.util.Scanner;

public class FirstProgram {
	
	// we need a main method
//	// java allows many main
//	public void main() {
//		
//	}
	//so this is the main--main method
	//when the program in java runs, the compiler looks for the main method and the class in which that
	//main method is then it calls like Nameoftheclass.main
	public static void main(String[] args) {
		
		//FirstProgram object=new FirstProgram();
		//object.main(args);
		//FirstProgram.main(args);
		//how to print hello world java
		//C++ cout<<"Hello World";
		//System is a class and out is an object.
		System.out.print("Welcome to JAC444");
		System.out.println("This is line 2");
		
		//C++ cin>>x
		Scanner input = new Scanner(System.in);
		int variable;
		double var;
		//int, boolean, double, long, char, float, byte
		//take int input
		System.out.println("Enter an integer value: ");
		variable = input.nextInt();
		
		//take double input
		System.out.println("Enter a double value:");
		var = input.nextDouble();
		
		//+ behaves as a unary operator or as a concatenation operator in java
		System.out.println("The integer value which in entered is: " + variable);
		System.out.println("The double value which in entered is: " + var);
		
		input.close();
		
	}

}


