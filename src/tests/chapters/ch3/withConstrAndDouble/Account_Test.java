package chapters.ch3.withConstrAndDouble;

import chapters.ch3.withConstructorAndDouble.Account;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Frank Borges XPTHQ on 2/25/2018.
 */
public class Account_Test
{
	@Test
	public void depositTest() throws Exception {
		Account acct1 = new Account("MonkeyButt", 169.96);
		
		acct1.deposit(1.00);
		
		assertEquals(170.96,acct1.getBalance(),0);
	}
	
	@Test
	public void testGetAndSetName() throws Exception {
		Account acct1 = new Account("DEF1",0.00);
		Account acct2 = new Account("DEF2",0.00);
		
		acct1.setName("TEST1");
		acct2.setName("TEST2");
		
		assertEquals("TEST1", acct1.getName());
		assertEquals("TEST2", acct2.getName());
	}
}
