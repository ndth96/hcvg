package excercises.lesson1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee e;
	@Before
	public void setUp() throws Exception {
		e = new Employee();
	}

	@Test
	public void testEmployee() {
		e = new Employee(1, "minh", "than", 1200);
		assertEquals(1, e.getId());
		assertEquals("minh", e.getLastName());
		assertEquals("than", e.getFirstName());
		assertEquals(1200, e.getSalary());
	}

	@Test
	public void testEmployeeIntStringStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLastName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSalary() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSalary() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnnualSalary() {
		fail("Not yet implemented");
	}

	@Test
	public void testRaiseSalary() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
