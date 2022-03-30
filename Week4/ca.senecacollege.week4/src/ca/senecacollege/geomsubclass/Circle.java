package ca.senecacollege.geomsubclass;

import ca.senecacollege.geom.*;

public class Circle extends GeomObj {
	
	private double radius;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled) {
		//color(color);
		super(color,filled);
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		
		return 2 * radius * Math.PI;
	}
	
	//public abstract double getPerimeter();
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	

}
