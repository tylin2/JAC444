package ca.senecacollege.poly;

public class Orange extends Apple {
	
int value = 30;
	
	@Override
	public float getTotalColories() {
		return 0.15f;
	}
	
	@Override
	public String getOrigin() {
		return "Orange country";
	}
	
	public void orangeMethod() {
		System.out.println("I am orangeMethod");
	}

}
