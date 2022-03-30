package ca.senecacollege.poly;

public class Apple extends Fruit {
	
	int value = 20;
	
	//@Override
	public double getTotalColorie() {
		return 0.35;
	}
	
	@Override
	public float getTotalColories() {
		return 0.35f;
	}
	
	@Override
	public String getOrigin() {
		return "Apple country";
	}
	
	public void hello() {
		System.out.println("Hello Apple");
	}

}
