package exercices.lesson2.ex51;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LineSubTest {
	Point begin;
	Point end;
	LineSub line;

	@Before
	public void setUp() throws Exception {
		begin = new Point(1, 2);
		end = new Point(3, 4);
	}



	@Test
	public void testLineSubPointPoint() {
		line = new LineSub(begin, end);
		double delta = 0.0001;
		assertEquals(Math.sqrt(8), line.getLength(), delta);
	}


}
