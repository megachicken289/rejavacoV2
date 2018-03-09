package chapters.ch6;

import org.junit.Assert;
import org.junit.Test;

import static chapters.ch6.Craps.rollDice;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Frank Borges XPTHQ on 2/25/2018.
 */
public class CrapsTest {
	@Test
	public void testRollDice() {
		int[] diceOutcome = new int[10];
		for (int outcome : diceOutcome) {
			boolean isInRange = false;
			outcome = rollDice();
			
			if (outcome > 1 && outcome <= 12) {
				isInRange = true;
			}
			assertTrue(isInRange);
		}
	}
}
