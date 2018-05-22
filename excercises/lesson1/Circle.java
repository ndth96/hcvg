package excercises.lession1;

public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double r){
        radius = r;
    }
    
    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = r;
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