package chapters.ch8.a_Case_Study;

import org.junit.Test;

import static chapters.ch8.a_Case_Study.Time1Test.displayTime;

/**
 * Created by Frank Borges XPTHQ on 3/10/2018.
 */
public class Time1TestTest {
	@Test
	public void testSetAndGetUniversalStringTime() {
		Time1 time1 = new Time1();
		time1.setTime(1,1,1);
		displayTime("Time - 1", time1);
	}
}
