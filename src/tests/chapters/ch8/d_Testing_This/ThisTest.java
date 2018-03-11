package chapters.ch8.d_Testing_This;

import chapters.ch8.d_Testing_This.ThisTest;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Frank Borges XPTHQ on 3/10/2018.
 */
public class ThisTest {
	@Ignore("This is right, but hard to convert without more middlemen")
	@Test
	public void testSimpleTimeBuildString() {
		SimpleTime time = new SimpleTime(1,2,3);
		SimpleTime timeCustom = new SimpleTime(4,5,6);
		assertEquals("this.toUniversalString(): 01:02:03\n     toUniversalString(): 01:02:03",
				time.buildString());
		assertEquals("this.toUniversalString(): 04:05:06\n     toUniversalString(): 04:05:06",
				timeCustom.buildString());
	
	}
	
	@Test
	public void testSimpleTimeToUniversalString() {
		SimpleTime time = new SimpleTime(1,2,3);
		SimpleTime timeCustom = new SimpleTime(4,5,6);
		assertEquals("01:02:03",
				time.toUniversalString());
		assertEquals("04:05:06",
				timeCustom.toUniversalString());
	
	}
	
	
}
