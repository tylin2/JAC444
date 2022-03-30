package ca.senecacollege.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new ArrayList<>();
		Collection<Integer> l2 = new ArrayList<>();
		ArrayList<Integer> l3 = new ArrayList<>(); //not create this way
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(3);
		l2.add(null);
		
		System.out.println("l2: " + l2);
		l2.remove(3); //remove the object
		System.out.println("l2: " + l2);
		l2.remove(null);
		System.out.println("l2: " + l2);
		
		
		System.out.println("List Part:");
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(null);
		
		System.out.println("l1: " + l1);
		l1.remove(3); //remove the index
		System.out.println("l1: " + l1);
		l1.remove(3);
		System.out.println("l1: " + l1);
		l1.add(0,9);
		System.out.println("l1: " + l1);
		
		System.out.println("RemoveAll");
		l1.removeAll(l2);
		System.out.println("l1: " + l1);
		System.out.println("l2: " +l2);
		
		System.out.println("AddAll");
		l1.addAll(1,l2);
		System.out.println("l1: " + l1);
		
		System.out.println(l2.contains(2));
		
		List<Integer> l4 = l1.subList(2, 3);
		System.out.println("l4: " + l4);
		l4.add(5);
		System.out.println("l4: " + l4);
		System.out.println("l1: " + l1);
		
		l1.add(0,20); 
		//System.out.println("l4: " + l4); // got error, if there is subList, we can not edit parent array
		System.out.println("l1: " + l1);
		//System.out.println("l4: " + l4); // got error, if there is subList, we can not edit parent array
		l4 = l1.subList(2, 3);
		System.out.println("l4: " + l4);
		
		System.out.println("String");
		String[] c1 = {"Black","Cyan","Red"};
		List<String> l5 = new LinkedList<>();
		for(String c : c1) 
			l5.add(c);
		System.out.println("l5: " + l5);
		

	}

}
