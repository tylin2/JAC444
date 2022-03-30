package ca.senecacollege.genericsm;

import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		IceHockey wayne = new IceHockey("Wayne");
		Basketball andrew = new Basketball("Andrew");
		Football bishop = new Football("Bishop");
		
		//--Raw types
		Team<Football> t1 = new Team<>("Toronto Argonauts");
		t1.addPlayer(bishop);
		
		Team<Basketball> t2 = new Team<>("Minnesota TimerWoles");
		t2.addPlayer(andrew);
		
		
		Team<IceHockey> t3 = new Team<>("Edmonton Oilwers");
		t3.addPlayer(wayne);
		
		/*Team<String> bt = new Team<>("Some Team");
		bt.addPlayer("Who");*/
		
		Team<Basketball> abc = new Team<>("ABC Team");
		Team<Basketball> xyz = new Team<>("XYZ Team");
		
		abc.matchResults(xyz, 1, 0);
		//abc.matchResults(t3, 0, 0); //Error
		t2.matchResults(xyz, 2, 1);
		
		System.out.println("Ranking");
		System.out.println(t1.getName() + " : " + t1.ranking());
		System.out.println(t2.getName() + " : " + t2.ranking());
		System.out.println(t3.getName() + " : " + t3.ranking());
		System.out.println(abc.getName() + " : " + abc.ranking());
		System.out.println(xyz.getName() + " : " + xyz.ranking());
		
		System.out.println(t2.compareTo(xyz));
		System.out.println(t2.compareTo(abc));
		System.out.println(abc.compareTo(xyz));
		//System.out.println(t2.compareTo(t1));//Error
		
		//Upper Bound Wildcards
		List<Integer> li = Arrays.asList(1,2,3,4);
		System.out.println("Sum : " + sumList(li));
		
		List<Double> lid = Arrays.asList(1.1,2.2,3.3);
		System.out.println("Sum : " + sumList(lid));
		printList(lid);
		
		//UnBounded Wildcard<?>
		List<String> ls = Arrays.asList("one"+"two","three");
		printList(ls);

	}

	private static void printList(List<?> ls) {
		for (Object s : ls) {
			System.out.println(s + " ");
		}
		
	}

	private static double sumList(List<? extends Number> li) {
		double s = 0;
		for (Number i : li) {
			s += i.doubleValue();
		}
		return s;
	}

}
