package quiz8;

import java.util.ArrayList;
import java.util.List;

public class Quiz8 {

	public static void main(String[] args) {
		 List list = new ArrayList<>();

	        list.add("A");

	        list.add("B");

	        list.add("C");

	        list.add("D");

	        for (int i = 0; i < list.size(); i++)
	                  System.out.print(list.remove(i));

	}

}
