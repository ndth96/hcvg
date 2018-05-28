package exercises.lesson2.ex52;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea(){
        return (radius*radius*Math.PI);
    }

    public double getCirumference(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "Circle[radius= "+radius+"]";
    }
}
