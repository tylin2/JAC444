package ca.senecacollege.innerclass;

public class Tester {

	public static void main(String[] args) {
		Outer obj = new Outer();
		//obj.obj.innerMethod();
		Outer.InnerClass inObj = obj.new InnerClass();
		inObj.innerMethod();
		//inObj.in_z;
	}

}
