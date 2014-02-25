import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class MarathonRunnerTests {
	@Test(expected = IllegalArgumentException.class)
	public void testBelowAge() {
		MarathonRunner tester = new MarathonRunner(10, 20);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAboveAge() {
		MarathonRunner tester = new MarathonRunner(102, 20);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testFuelTooLow() {
		MarathonRunner tester = new MarathonRunner(42, -1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testFuelTooHigh() {
		MarathonRunner tester = new MarathonRunner(42, 101);
	}
	@Test
	public void testQuotientFuelBelow50() {
		MarathonRunner tester = new MarathonRunner(40, 20);
		assertEquals("age is 40 fuel is 20", 20, tester.getQuotient());
	}
	@Test
	public void testQuotientFuelAbove50AndAgeAbove30() {
		MarathonRunner tester = new MarathonRunner(40, 80);
		assertEquals("age is 40 fuel is 20", 40, tester.getQuotient());
	}
	@Test
	public void testQuotientFuelAbove50AndAgeBelow30() {
		MarathonRunner tester = new MarathonRunner(20, 80);
		assertEquals("age is 40 fuel is 20", 100, tester.getQuotient());
	}

}
