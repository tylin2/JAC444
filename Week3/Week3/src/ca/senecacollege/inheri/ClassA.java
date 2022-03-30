package ca.senecacollege.inheri;

/*Modifiers:
 * private - they are not going to be inherited
 * public - anyone can access them
 * default - Accessible inside the package or can be inherited but not outside the package
 * protected -  this is specifically designed for inheritance purpose, it has same access
 * like default members but in addition it also provides special access to only subclasses outside
 * the package.
 */

public class ClassA {
	
	private static int privateX = 1;
	public static int publicX = 2;
	static int defaultX = 3;
	protected static int protectedX = 4;

}
