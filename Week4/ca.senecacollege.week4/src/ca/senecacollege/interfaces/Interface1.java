package ca.senecacollege.interfaces;
/*Java solve the problem of multiple inheritance via Interfaces
 * Interfaces are a reference type and never can be an Object type, meaning no Instantiation.
 * if we remove the public modifier before the interface than it has default access
 * interface can only have properties of final and static type
 * Why static -- because interfaces can't be instantiated so if you need you can access them by
 * 					the name of the Interface and with field Name
 * Why final -- to avoid diamond problem
 * interface can include abstract method
 * interfaces can include default an static methods (from java 8 and onwards)
 */

public interface Interface1 {
	
	public final static int x = 10;
	int y = 0;
	
	public abstract void print();
	
	void method1(String st);
	
	default void log(String st) {
		System.out.println("I am form interface 1 " + st);
	}

}
