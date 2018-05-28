package excercises.lesson1;
import org.junit.Test;

import excercises.lesson1.Employee;;


import static org.junit.Assert.assertEquals;


public class EmployeeTest {
    @Test

    public void testGetAnnualSalary() {
        Employee e = new Employee();

        e.setSalary(10);

        double delta = 0.000001;
        assertEquals(12*10, e.getAnnualSalary());
    }

    @Test 
    
    public void testGetSetRadius() {
        Circle c = new Circle();

        c.setRadius(10);

        double delta = 0.0001;
        assertEquals(10, c.getRadius(), delta);
    }
    
}