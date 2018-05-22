package excercises.lession1;

//import javafx.scene.shape.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        //c.setRadius(2.0);
        double s = 1.0;
        System.out.println("Radius = "+c.getRadius() +" Area = "+c.getArea());

        Circle d =  new Circle(2);
        System.out.println(d.toString());
        
    }
    
}