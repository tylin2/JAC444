package ca.senecacollege.geom;

import java.util.Date;

/*Sometimes a superclass is so abstract that it cannot be used to create any specific instance
 * these kind of classes are referred to as abstract classes.
 */
public abstract class GeomObj {
	
	private String color ="white";
	private boolean filled;
	private java.util.Date datecreated;
	
	public GeomObj() {
		
	}
	public GeomObj(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	public GeomObj(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(java.util.Date datecreated) {
		this.datecreated = datecreated;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	/* An abstract class cannot be used to create objects (can't be instantiated).
	 * An abstract class can contain abstract methods, which are implemented in concrete classes,
	 * the class has to be an abstract class as well.
	 * abstract methods has to be implemented in the subclass.
	 * subclass can be abstract class even the superclass is not.
	 * A subclass can override a method from its superclass to define it abstract
	 * 		This is rare, but only useful when the implementation of the method
	 * 		in the superclass becomes invalid in the subclass.
	 * */
	@Override
	public String toString() {
		return "GeomObj [color=" + color + ", filled=" + filled + ", datecreated=" + datecreated + "]";
	}
	
	
	
	

}
