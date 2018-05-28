package excercises.lesson1;
import org.junit.Test;

import excercises.lesson1.Circle;


import static org.junit.Assert.assertEquals;


public class CircleTest {
    @Test

    public void testGetArea() {
        Circle c = new Circle();

        double delta = 0.000001;
        assertEquals(Math.PI, c.getArea(), delta);
    }

    @Test 
    
    public void testGetSetRadius() {
        Circle c = new Circle();

        c.setRadius(10);

        double delta = 0.0001;
        assertEquals(10, c.getRadius(), delta);
    }
    
}