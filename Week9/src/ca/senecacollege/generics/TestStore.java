package ca.senecacollege.generics;

import java.util.Date;
//A program can not import two date
//import java.sql.Date;

public class TestStore {

	public static void main(String[] args) {
		
		/*Store s= new Store();
		
		Book book = new Book();
		s.set(book);
		
		//Programmer #1
		s.set(new Date());
		
		Date d = (Date) s.get(); //Type casting
		
		//Programmer #2
		s.set((java.sql.Date) new Date());
		Date d1 = ((java.sql.Date) s.get());
		s.set(1);
		s.set("string");*/
		
		Store<Date> s1 = new Store<Date>();
		s1.set(new Date());
		Date d = s1.get();
		
		Store<Integer> s2 = new Store<>();
		s2.set(1);
		//s2.set("s"); //get a complier error
		//Type Erasure
		
		

	}

}
