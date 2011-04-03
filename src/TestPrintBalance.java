import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestPrintBalance {

	@Test
	public void testJUnit() {
		assertTrue("The computer isn't feeling well today...", true);
	}
	
	@Test
	public void testPrintBalanceDefaultConstructor() {
		assertNotNull(new PrintBalance());
	}

	@Test
	public void testPrintBalanceLocaleConstructor() {
		assertNotNull(new PrintBalance("en", "US"));
	}
	

}
