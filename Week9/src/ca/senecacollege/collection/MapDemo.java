package ca.senecacollege.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<>();
		m1.put("John", 29);
		m1.put("Kyle", 35);
		//m1.put(null, null);
		//m1.put(null, 45);
		m1.put("Maxi", null);
		System.out.println("m1:¡@" + m1);
		
		m1.put("Maxi",29);
		System.out.println("m1:¡@" + m1);
		
		m1.put(null,29);
		//m1.put(null,29);
		//m1.put("Maxi", 30);
		System.out.println("m1:¡@" + m1);
		
		System.out.println("Contains Kyle? " + m1.containsKey("Kyle"));
		System.out.println("Kyle' s age: " + m1.get("Kyle"));
		
		System.out.println("Intrating using Keyset");
		Set<String> names = m1.keySet();
		System.out.println("names: " + names);
		
		for(String n : names) {
			System.out.println("Name: " + n + ", age: " + m1.get(n));
		}
		
		System.out.println("Iterating using entry set...");
		Set<Map.Entry<String, Integer>> m2 = m1.entrySet();
		for(Map.Entry<String, Integer> map : m2) 
			System.out.println("Name: " + map.getKey() + " age: " + map.getValue());
			
		//Creating a profile
		Map<String, Map<String,Object>> userProfile = new HashMap<>();
		Map<String, Object> prof = new HashMap<>();
		prof.put("age", 25);
		prof.put("dept", "CS");
		prof.put("city", "Toronto");
		
		userProfile.put("Ali",prof);
		System.out.println("userProfile: " + userProfile);

	}

}
