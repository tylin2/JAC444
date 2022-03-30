package ca.senecacollege.tester;

import ca.senecacollege.geom.GeomObj;
import ca.senecacollege.geomsubclass.Circle;
import ca.senecacollege.geomsubclass.Ractangle;

public class TestClass {
	
	public static void main(String[] args) {
		
		//GeomObj obj = new GeomObj();
		Circle circ = new Circle();
		
		GeomObj obj1 = new Circle(6);
		GeomObj obj2 = new Ractangle(8,9);
		
		GeomObj[] objArr = new GeomObj[4];
		objArr[0] = new Circle();
		
		System.out.println("A circle: " + circ.toString());
		System.out.println("A color is: " + circ.getColor());
		
		Ractangle rect = new Ractangle("Black", true, 1,1);
		System.out.println("A Recta: " + rect.toString());
		
		displayObj(new Circle());
		displayObj(new Ractangle());
		System.out.println("The two objects have the same area? " + equalArea(obj1,obj2));
	}
	
	public static void displayObj(GeomObj obj) {
		System.out.println("Creat on " +obj.getDatecreated() + ". color is " + obj.getColor() 
		+ " is filled " + obj.isFilled());		
	}
	
	public static boolean equalArea(GeomObj obj1, GeomObj obj2) {
		return obj1.getArea() == obj2.getArea();
	}

}
