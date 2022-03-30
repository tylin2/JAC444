package ca.senecacollege.lambdas;

public class Test implements LambdaExample {

	public static void main(String[] args) {
		LambdaExample ob = new Test();
		System.out.println(ob.Hello());
		
		ob = ()->{return "Lambda with no prameters";};
		
		System.out.println(ob.Hello());

	}

	@Override
	public String Hello() {
		
		return "A string returned by the overriden method";
	}

}
