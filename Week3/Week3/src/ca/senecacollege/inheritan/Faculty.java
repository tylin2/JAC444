package ca.senecacollege.inheritan;

public class Faculty extends Employee {
	
	public Faculty() {
		System.out.println("Faculty class no-args contructor is called");
	}
	
	public static void main(String[] args) {
		new Faculty();
	}

}
