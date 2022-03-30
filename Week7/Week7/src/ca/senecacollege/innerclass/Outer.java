package ca.senecacollege.innerclass;

public class Outer {
//	class InnerClass{
//		int in_x = 100;
//		static final int in_y = 200;
//		private int in_z = 300;
//		public void innerMethod() {
//			System.out.println("I am in the inner class");
//			System.out.println("The inner class can access the outer class public varible: " + x);
//		}
//		
//	}
	
	int x = 20;
	static int y =50;
	private int z = 60;
	InnerClass obj = new InnerClass();
	
	public void outerMethod() {
		System.out.println("I am in the outer class");
		System.out.println("The outer class can access the inner class public varible: " 
				+ obj.in_x + " accessing the inner class static variable " + obj.in_y
				+ " accessing the inner private variable " + obj.in_z);
	}
	
	class InnerClass{
		int in_x = 100;
		static final int in_y = 200;
		private int in_z = 300;
		public void innerMethod() {
			System.out.println("I am in the inner class");
			System.out.println("The inner class can access the outer class public varible: " 
					+ x	+ "accessing the outer static:¡@" + y + z	);
		}
		
	}

}
