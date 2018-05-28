package exercises.lesson2.ex41;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
		super();
		height = 1.0;
	}
	public Cylinder(double radius) {
		this.setRadius(radius);
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return this.getArea()*height;
	}
	
	@Override
	public String toString() {
		return "Cylunder: subclass of " +super.toString() +"height = "+height;
	}
}
