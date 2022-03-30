package ca.senecacollege.interfaces;

//public interface Interface2 {
//
//}

public interface Interface2  { //extends Interface1
	void method1(String str);
	default void log(String x) {
		System.out.println("I am Interface 2 " + x);
		//Interface1.super.log("I am getting invoked from interface 2");
	}
	
}
