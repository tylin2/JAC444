package ca.senecacollege.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("a");
		s1.add("b");
		s1.add("b");
		s1.add("c");		
		System.out.println("s1: " + s1);
		
		Set<Book> s2 = new HashSet<>();
		
		Book b1 = new Book("Walden", "Henry David",1854);
		Book b2 = new Book("Walden", "Henry David",1854);
		
		s2.add(b1);
		s2.add(b2);
		System.out.println("s2: " + s2);
		
		Set<String> s3 = new TreeSet<>();
		s3.add("Jhon");
		s3.add("Zebra");
		s3.add("xerox");
		s3.add("apple");
		s3.add("Apple");
		System.out.println("s3: " + s3);
		
		Book b3 = new Book("Harray Potter", "J.K.Rowling",1997);
		Book b4 = new Book("Effective Java", "Joshua Bloch",2008);
		//Set<Book> s4 = new TreeSet<>();
		Set<Book> s4 = new TreeSet<>(new CompareAuthor());
		s4.add(b1);
		s4.add(b2);
		s4.add(b3);
		s4.add(b4);
		
		System.out.println("s4: " + s4);
	}

}
