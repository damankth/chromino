package chrominox.domains;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoordinateTest {

	private Coordinate coordinate1;
	private Coordinate coordinate2;
	private Coordinate coordinate3;
	
	@BeforeEach
	void coorcinate() {
		coordinate1= new Coordinate(2,3);

		coordinate2= new Coordinate(2,3);

		coordinate3= new Coordinate(5,7);
	}
	@Test
	void testgetX() {
		assertEquals(2, coordinate1.getX());
	}
	@Test
	void testgetY() {
		assertEquals(3, coordinate1.getY());
	}
	@Test
	void testCoordinateEquals() {
		assertTrue(coordinate1.equals(coordinate2));
	}
	@Test
	void testCoordinateEqualsfalse() {
		assertFalse(coordinate1.equals(coordinate3));
	}
	@Test
	void testCoordinateEqualsNull() {
		assertFalse(coordinate1.equals(null));
	}
	
}
