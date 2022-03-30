package quiz11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Quiz11 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("321", "Kyle Wright");
		map.put("555", "Alex Yao");
		map.put("321", "Peter Smith");
		map.put("999", "Peter Smith");
		System.out.println(map);
		
//		LinkedHashSet<String> setl = new LinkedHashSet<>(); 
//		setl.add("Toronto"); 
//		LinkedHashSet<String> set2 = setl;
//		setl.add("Markham"); 
//		set2.add("Mississauga"); 
//		System.out.println(set2); 
		
//		Set<A> set = new HashSet<A>();
//		set.add(new A());
//		set.add(new A());
//		set.add(new A());
//		set.add(new A());
//		System.out.println(set);
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.remove(2);
//		System.out.println(list);

	}

}

class A{
	int r=1;
	public String toString() {
		return r+"";
	}
	public boolean equals(Object o) {
		return this.r == ((A)o).r;
	}
	public int hashCode() {
		return r;
	}
}
