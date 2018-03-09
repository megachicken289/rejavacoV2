package chapters.ch6;

import org.junit.Assert;
import org.junit.Test;

import static chapters.ch6.MethodOverload.square;

/**
 * Created by Frank Borges XPTHQ on 3/8/2018.
 */
public class MethodOverloadTest {
	@Test
	public void testSquareInt() throws Exception {
		
		int squareInt1 = square(2);
		int squareInt2 = square(4);
		int squareInt3 = square(6);
		int squareInt4 = square(8);
		int squareInt5 = square(10);
		
		Assert.assertEquals(4,squareInt1);
		Assert.assertEquals(16,squareInt2);
		Assert.assertEquals(36,squareInt3);
		Assert.assertEquals(64,squareInt4);
		Assert.assertEquals(100,squareInt5);
	}
	
	@Test
	public void testSquareDouble() throws Exception {
		
		double squareDouble1 = square(2.5);
		double squareDouble2 = square(4.5);
		double squareDouble3 = square(6.5);
		double squareDouble4 = square(8.5);
		double squareDouble5 = square(10.5);
		
		Assert.assertEquals(6.25,squareDouble1,0);
		Assert.assertEquals(20.25,squareDouble2,0);
		Assert.assertEquals(42.25,squareDouble3,0);
		Assert.assertEquals(72.25,squareDouble4,0);
		Assert.assertEquals(110.25,squareDouble5,0);
	}
	
}
