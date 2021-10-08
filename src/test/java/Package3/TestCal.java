package Package3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {

	@Test
	public void test() {
		Cal ob = new Cal();
		assertEquals(8, ob.sum(5, 3));
		assertEquals(2, ob.diff(5, 3));
		assertEquals(15, ob.pro(5, 3));
		assertEquals(2, ob.divide(5, 3));
	}

}
