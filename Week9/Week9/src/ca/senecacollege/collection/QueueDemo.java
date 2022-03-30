package ca.senecacollege.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {

	public static void main(String[] args) {
		Deque<String> d1 = new ArrayDeque<>();
		
		d1.add("Kyle");
		d1.add("Blue");
		
		System.out.println("d1: " + d1);
		
		d1.push("Kyle"); //push at the 1st
		d1.push("Blue");
		System.out.println("d1: " + d1);

	}

}
