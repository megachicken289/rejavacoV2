package chapters.ch3.withConstrAndDouble;

import chapters.ch3.withConstructorAndDouble.Account;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Frank Borges XPTHQ on 2/25/2018.
 */
public class Account_Test {
	@Test
	public void testAccountBalanceLogic() throws Exception {
		Account acct = new Account("MonkeyButt", 100.50);
		Account acctFalse = new Account("FakeButt", -10.00);
		
		assertEquals(100.50,acct.getBalance(),0);
		assertEquals(0,acctFalse.getBalance(),0);
	}
	
	@Test
	public void depositTest () throws Exception {
		Account acct1 = new Account("MonkeyButt", 169.96);
		
		acct1.deposit(1.00);
		
		assertEquals(170.96, acct1.getBalance(), 0);
	}
	
	@Test
	public void testGetAndSetName () throws Exception {
		Account acct1 = new Account("DEF1", 0.00);
		Account acct2 = new Account("DEF2", 0.00);
		
		acct1.setName("TEST1");
		acct2.setName("TEST2");
		
		assertEquals("TEST1", acct1.getName());
		assertEquals("TEST2", acct2.getName());
	}
	
	@Test
	public void testGetAndSetBal () throws Exception {
		Account acct1 = new Account("DEF1", 10.00);
		Account acct2 = new Account("DEF2", -10.00);
		
		acct1.deposit(10.00);
		acct2.deposit(10.00);
		
		assertEquals(20.00, acct1.getBalance(),0);
		assertEquals(10.00, acct2.getBalance(),0);
	}
}
