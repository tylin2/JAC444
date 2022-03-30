package ca.senecacollege.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstTest {
	
	MathEx mObj = new MathEx();
	
	@Test
	void test() {
//		fail("Not yet implemented");
		System.out.println("Test case 1");
		String str = "Test";
		assertEquals("Test", str);
	}
	
	@Test
	@DisplayName("Sum with 3 numbers")
	public void sum_3num() {
		assertEquals(6,mObj.sum(new int[] {1,2,3}));
	}
	
	@Test
	@DisplayName("Sum with 1 numer")
	public void sum_1num() {
		assertEquals(3,mObj.sum(new int[] {3}));
	}

}
