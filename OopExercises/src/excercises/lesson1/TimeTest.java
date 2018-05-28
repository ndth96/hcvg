package excercises.lesson1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {
	
	Time t1 = new Time(10, 10, 10);
    Time t2 = new Time(23, 59, 59);
    Time t3 = new Time(0, 0, 0);
	@Before
	public void setUp() throws Exception {
	}



	@Test
	public void testGetSet() {
		t1.setSecond(23);
		assertEquals(23, t1.getSecond());
		
		t1.setMinute(15);
		assertEquals(15, t1.getMinute());
		
		t1.setHour(2);
		assertEquals(2, t1.getHour());
		
		t1.setTime(10, 10, 10);
		assertEquals("10:10:10", t1.toString());
		
	
	}

	

	@Test
	public void testToString() {
		t2.setTime(2, 3, 4);
		assertEquals("02:03:04", t2.toString());
		assertEquals("10:10:10", t1.toString());
		
	}

	@Test
	public void testNextSecond() {

		t1.setTime(2, 4, 59);
		t1.nextSecond();
		t3.setTime(20, 59, 59);
		
		t3.nextSecond();
		
		t2.nextSecond();

		assertEquals("00:00:00", t2.toString());
		assertEquals("02:05:00", t1.toString());
		assertEquals("21:00:00", t3.toString());

		
	}

	@Test
	public void testPreviousSecond() {
		t3.previousSecond();
		assertEquals("23:59:59", t2.toString());
	}

}
