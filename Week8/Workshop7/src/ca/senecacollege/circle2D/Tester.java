/**********************************************
Workshop 6
Course: JAV444 - W
Last Name:Lin
First Name:Ting-Yeh
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/03/18
**********************************************/
package ca.senecacollege.circle2D;

public class Tester {

	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		System.out.println("Circle1 area: " + c1.getArea()); 
		System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
		System.out.println(
			"Does circle1 contain the point (3, 3)? " + c1.contains(3, 3)); 
		System.out.println(
			"Does circle1 contain the circle centered at (4, 5) and radius 10.5? " 
			+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " 
			+ c1.overlaps(new Circle2D(3, 5, 2.3)));

	}

}
