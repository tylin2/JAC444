package ca.senecacollege.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class TestActor {

	public static void main(String[] args) {
		
		Actors john = new Actors("John Doe",30);
		Actors snow = new Actors("Snow White",55);
		Actors jack = new Actors("Jack Jill",40);
		Actors bill = new Actors("Bill Fransis",21);
		
		List<Actors> actors = new ArrayList<>();
		actors.add(john);
		actors.add(jack);
		actors.add(snow);
		actors.add(bill);
		
		Collections.sort(actors, new Comparator<Actors>() {
			@Override
			public int compare(Actors o1, Actors o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Actors a : actors) {
			System.out.println(a.getName());
		}
		
		// using Comparator as a Functional Interface
		System.out.println("using Comparator as a Functional Interface");
		Collections.sort(actors,(actor1,actor2) -> actor1.getName().compareTo(actor2.getName()));
		for(Actors a : actors) {
			System.out.println(a.getName());
		}
		
		String str = dostuff(new UpConc() {
			@Override
			public String upperAndConcat(String s1, String s2) {
				return s1.toUpperCase() + " " + s2.toUpperCase();
			}
		}, actors.get(0).getName(), actors.get(1).getName());
		System.out.println(str);
		
//		UpConc ob = (String s1, String s2) -> {
//			String res = s1.toUpperCase() + " " + s2.toUpperCase();
//			return res;
//		};
		
		//simple form
		UpConc ob_simple = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();
		String str_L = dostuff(ob_simple, actors.get(2).getName(), actors.get(3).getName());
		System.out.println(str_L);
		
		actors.forEach(actor -> {
			System.out.print(actor.getName() + " ");
			System.out.println(actor.getAge());
		}); //void java.util.function.Consumer.accept(Actors t)
		
		Actors red = new Actors("Red Ridinghood",35);
		Actors charming = new Actors("Princ Charming",38);
		actors.add(red);
		actors.add(charming);
		System.out.println("Actors over 30");
		System.out.println("================");
		/*for(Actors a:actors) {
			if(a.getAge() >= 30) {
				System.out.println(a.getName());
			}
		}*/
		actors.forEach(a ->{
			if(a.getAge() >= 30)
				System.out.println(a.getName());
		});
		
		System.out.println("\nActors under 29");
		System.out.println("================");
		actors.forEach(a ->{
			if(a.getAge() < 30)
				System.out.println(a.getName());
		});
		
		printActorByAge(actors, "Actors over 30",a->a.getAge() >= 30);
		printActorByAge(actors, "\nActors under 29",a->a.getAge() < 30);
	}

	private static void printActorByAge(List<Actors> actors, String string, Predicate<Actors> ageCondition) {
		
		System.out.println(string);
		System.out.println("================");
		for(Actors a: actors) {
			if(ageCondition.test(a)) {
				System.out.println(a.getName());
			}
		}
		//DoubleConsumer, IntConsumer, DoublePredicate, BiConsumer
		IntPredicate gT15 = i -> i> 15;
		IntPredicate lT100 = i -> i < 100;
		System.out.println("\n" + gT15.test(15));
		
		int a = 20;
		System.out.println(gT15.test(a+5));
		System.out.println(gT15.and(lT100).test(50));
	}
	
	

	private static String dostuff(UpConc upConc, String name, String name2) {
		
		return upConc.upperAndConcat(name, name2);
	}

}
