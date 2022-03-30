package ca.senecacollege.test;

import javax.naming.NameNotFoundException;

public class LinearS extends Exception {
	private int[] data;
	
	LinearS(int[] arr){
		this.data = arr;
	}
	
	int getNumPos(int value) {
		for(int i=0;i<data.length;i++) {
			if(data[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	//unchecked exceptions
	int divide (int i, int div) {
		return (i/div);
	}
	
	//for checked exception
	public LinearS(String message) {
		super(message);
	}
	
	String findByName (String name) throws NameNotFoundException {
		throw new NameNotFoundException(name + " not found!");
	}

}
