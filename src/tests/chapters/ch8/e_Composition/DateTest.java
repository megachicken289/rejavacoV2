package chapters.ch8.e_Composition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Frank Borges XPTHQ on 3/11/2018.
 */
public class DateTest {
	@Test
	public void testDateConstructor() {
		Date date = new Date(1,2,3);
		Date dateReal = new Date(3,14,2013);
		Date dateDoubleDigits = new Date(12,31,2018);
		
		assertEquals("1/2/3",date.toString());
		assertEquals("3/14/2013",dateReal.toString());
		assertEquals("12/31/2018",dateDoubleDigits.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDateConstructorFail() {
		Date date = new Date(99,99,99);
		assertNotEquals("99/99/99",date.toString());
	}
}
