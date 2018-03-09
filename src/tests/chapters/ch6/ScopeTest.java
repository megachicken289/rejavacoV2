package chapters.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Frank Borges XPTHQ on 3/8/2018.
 */
public class ScopeTest {
	private static int x = 1;
	
	@Test
	public void testUseLocalVariable () throws Exception {
		int x = 25;
		
		Assert.assertEquals(25, x);
	}
	
	@Test
	public void testUseField () throws Exception {
		Assert.assertEquals(1, x);
	}
	
}
