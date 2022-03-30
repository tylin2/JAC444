
public class MethodsExample {
	
	//signature of the method involves name of the method and parameter
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		double a1 = 2.2;
		double b1 =3.3;
		
		//MethodsExample.max(a, b);
		//Static: you can call only static method in the static way
		//but non-static method can have any kind of method in them
		max(a,b); //actual parameters
		//Java is purely pass by value language
		//there is no pass by reference in java, there is & symbol in java
		
		//method Overloading
		double return_value = max(a1,b1);
		System.out.println("The max of two numbers is: " + return_value);
		System.out.println("The max of two numbers is: " + max(a1,b1));
		
		/*
		 * args[0] = argument 1
		 * args[1] = argument 2
		 * Integer, Double, String, Character etc.
		 */
		if(args.length==2) {
			int a2 = Integer.parseInt(args[0]); //args[0] = "1"
			int b2 = Integer.parseInt(args[1]); //args[1] = "2"
			
			System.out.println("The addition of two numbers: " + Addition.add(a2, b2));
		}
	}
	
	//public void max(int x,int y) {
	public static void max(int x,int y) { //formal parameters
		if(x > y)
			System.out.println(x+" is greater then "+y);
		else
			System.out.println(y+" is greater then "+x);
				
		//add(2,5);
	}
	
	public static double max(double x,double y) {
		if(x > y)
			return x;
		else
			return y;
	}
	
	
	public void add(int a,int b) {
		max(2,5);
	}

}

//we can not have function outside class.