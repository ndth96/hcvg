package excercises.lesson1;
import org.junit.Test;

import excercises.lesson1.Circle;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;


public class CircleTest {
	
	private Circle c;
	@Before
	public void setUp() throws Exception {
		c = new Circle();
	}
	
	@Test
	public void testCircle() {
		double delta = 0.0001;
        assertEquals(1, c.getRadius(),delta);
	}
	
	@Test
    public void testCircleDouble(){
        c = new Circle(3);
        double delta = 0.0001;
        assertEquals(3, c.getRadius(),delta);
    }
    
    @Test

    public void testGetArea() {


        double delta = 0.000001;
        assertEquals(Math.PI, c.getArea(), delta);
    }

    @Test 
    
    public void testGetSetRadius() {
        c.setRadius(10);

        double delta = 0.0001;
        assertEquals(10, c.getRadius(), delta);
    }
    
    @Test
    public void testGetCirumference() {
    	double delta = 0.0001;
    	assertEquals(2*1*Math.PI, c.getCirumference(), delta);
    }
    


	@Test
	public void testGetRadius() {
		double delta = 0.0001;
    	assertEquals(1, c.getRadius(), delta);
	}

	@Test
	public void testSetRadius() {
		c.setRadius(2);
		double delta = 0.0001;
    	assertEquals(2, c.getRadius(), delta);
	}

	@Test
	public void testToString() {
		String str = "Circle[radius= 1.0]";
		assertEquals(str, c.toString());
	}
}