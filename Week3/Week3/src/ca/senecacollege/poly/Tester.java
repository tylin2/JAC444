package ca.senecacollege.poly;

public class Tester {
	public static void main(String[] args) {
		Fruit frObj = new Fruit();
		Apple appObj = new Apple();
		Orange orObj = new Orange();
		
		System.out.println("Calories of Fruit " + frObj.getTotalColories());
		
		//down-casting
		Fruit appfrObj = new Apple();
		Fruit orfrObj = new Orange();
		
		appfrObj.getTotalColories();
		//System.out.println("Colories of Fruit: " + appfrObj.hello());
		System.out.println("Colories of Fruit: " + appfrObj.getTotalColories());
		System.out.println("Colories of Fruit: " + orfrObj.getTotalColories());
		
		//up-casting
		//Apple frappObj = (Apple) new Fruit();
		//System.out.println("Colories of Fruit: " + frappObj.getTotalColories());
		/*Java is considered to be a Type - Safe language
		 * Type safety is checked on
		 * static/ Compile time: int x = (double) 0.2;
		 * dynamic/ Run time: -- this will be checked on run-time
		 * instanceof
		 */
		Tester test = new Tester();
		test.orangeMethod(new Apple());
		test.orangeMethod(new Orange());
	}
	
	public void orangeMethod(Apple appObj) {
		//appObj.orangeMethod();
		//((Orange)appObj).orangeMethod();
		if(appObj instanceof Orange) {
			((Orange)appObj).orangeMethod();
		} 
		else {
			System.out.println("Invalid object has been passed");
		}
	}

}
//via Generics <T> AKA Template from c++
