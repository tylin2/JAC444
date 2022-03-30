package ca.senecacollege.geomsubclass;

import ca.senecacollege.geom.GeomObj;

public class Ractangle extends GeomObj {
	
	private double width;
	private double height;
	
	public Ractangle() {}
	
	
	
	public Ractangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Ractangle(String color,boolean filled, double height, double width) {
		super(color,filled);
		this.height = height;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public double getArea() {		
		return width * height;
	}



	@Override
	public double getPerimeter() {		
		return 2 * (width + height);
	}
	
	

}
