package ca.senecacollege.lambdas;

/* Lamda's are basically Anonymous Functions...
 * Java treats the functional programming/lambda as an expression... (Expression Language)
 * Functional Interface: exposes a single Abstract Method (SAM)
 * this interface can have only one abstract method, 
 * you are allowed to have default type method, as well static.
 */

@FunctionalInterface
public interface LambdaExample {
	
	//Test Class
	//String Hello();
	//String Hello1();
	
	//TestParam Class
	int comp(int c);

}
