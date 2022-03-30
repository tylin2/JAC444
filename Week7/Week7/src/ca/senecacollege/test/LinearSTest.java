package ca.senecacollege.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.naming.NameNotFoundException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinearSTest {

	private static LinearS search;
	// -- must be static method in it, runs once before any test method
	@BeforeAll
	static void setup() {
		int[] arr = {2,3,4,10,40};
		search = new LinearS(arr);
	}
	
	@Test
	@DisplayName("Get the position of the number")
	void getPos() {
		int res = search.getNumPos(10);
		assertEquals(3,res);
	}
	
	@Test
	@DisplayName("No number exist")
	void noNum() {
		int res = search.getNumPos(55);
		assertEquals(-1,res);
	}
	
	@AfterAll
	static void finish() {
		System.out.println("All the tests are finished");
	}
	
	//@Before
	//@After
	//@BeforeClass
	//@AfterClass
	
	//Testing unchecked exceptions
	@Test
	@DisplayName("Unchecked Exception")
	void divisionEx() {
		Exception ex = assertThrows(ArithmeticException.class,()->search.divide(1,0));
		assertEquals("/ by zero", ex.getMessage());
		//assertTrue(ex.getMessage().contains("zero"));
	}
	
	//Testing the checked Exception
	@Test
	@DisplayName("Checked Exception")
	void ex_custome() {
		String filename = "someone.txt";
		Exception ex = assertThrows(NameNotFoundException.class,()->search.findByName(filename));
		assertEquals(filename + " not found!", ex.getMessage());
	}

}
