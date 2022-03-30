package ca.senecacollege.lambdas;

public class TestFunct1 {

	public static void main(String[] args) {
		
		// 1st way
		System.out.println("Is the sum enve? " + new FunctInter() {
			@Override
			public boolean evenOrodd(int x, int y) {
				return (x+y) % 2 == 0;
			}
		}.evenOrodd(1, 2));
		
		// 2en way
		FunctInter ob = (x,y) -> (x+y) % 2 == 0;
		System.out.println(ob.evenOrodd(2, 4));

	}

}
