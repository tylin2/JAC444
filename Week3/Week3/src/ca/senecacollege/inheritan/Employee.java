package ca.senecacollege.inheritan;

public class Employee extends Person {
	
	public Employee() {
		this("Employee Class Overloaded Contructor is invoked");
		System.out.println("Employee class no-args contructor is invoked");
	}
	public Employee(String s) {
		System.out.println(s);
	}

}
