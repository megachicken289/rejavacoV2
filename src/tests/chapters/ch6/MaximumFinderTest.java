package chapters.ch6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Frank Borges XPTHQ on 2/25/2018.
 */
public class MaximumFinderTest {
	@Test
	public void testMaximum() throws Exception{
		double isMax1 = MaximumFinder.maximum(1,2,3);
		double isMax2 = MaximumFinder.maximum(2,3,1);
		double isMax3 = MaximumFinder.maximum(3,1,2);
		
		assertEquals(3,isMax1,0);
		assertEquals(3,isMax2,0);
		assertEquals(3,isMax3,0);
	}
}
