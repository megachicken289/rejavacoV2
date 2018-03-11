package chapters.ch8.c_Overloading_Constructors;

import chapters.ch8.c_Overloading_Constructors.Time2Test;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Frank Borges XPTHQ on 3/10/2018.
 */
public class c_Overloading_Constructors {
	@Test
	public void testConstructorEmpty () throws Exception {
		Time2 time0 = new Time2();
		
		
		assertEquals(0, time0.getHour());
		assertEquals(0, time0.getMinute());
		assertEquals(0, time0.getSecond());
	}
	
	@Test
	public void testConstructorHour() {
		Time2 time = new Time2(1);
		assertEquals(1,time.getHour());
		assertEquals(0,time.getMinute());
		assertEquals(0,time.getSecond());
	}
	
	@Test
	public void testConstructorHourMinute() {
		Time2 time = new Time2(1,2);
		assertEquals(1,time.getHour());
		assertEquals(2,time.getMinute());
		assertEquals(0,time.getSecond());
	}
	
	@Test
	public void testConstructorHourMinuteSecond() {
		Time2 time = new Time2(1,2,3);
		assertEquals(1,time.getHour());
		assertEquals(2,time.getMinute());
		assertEquals(3,time.getSecond());
	}
	
	@Test
	public void testConstructorWithTime2Parameter() {
		Time2 timeWithinTime = new Time2(4,5,6);
		Time2 timeWithinTimeConstructor = new Time2(timeWithinTime);
		assertEquals(4,timeWithinTimeConstructor.getHour());
		assertEquals(5,timeWithinTimeConstructor.getMinute());
		assertEquals(6,timeWithinTimeConstructor.getSecond());
	}
	
	@Test
	public void testSetAndGetTime() {
		Time2 time = new Time2();
		time.setTime(4,5,6);
		assertEquals(4,time.getHour());
		assertEquals(5,time.getMinute());
		assertEquals(6,time.getSecond());
	}
	
	@Test
	public void testSetAndGetTimeHour() {
		Time2 time = new Time2();
		time.setHour(4);
		assertEquals(4,time.getHour());
		assertEquals(0,time.getMinute());
		assertEquals(0,time.getSecond());
	}
	
	@Test
	public void testSetAndGetTimeMinute() {
		Time2 time = new Time2();
		time.setMinute(5);
		assertEquals(0,time.getHour());
		assertEquals(5,time.getMinute());
		assertEquals(0,time.getSecond());
	}
	
	@Test
	public void testSetAndGetTimeSecond() {
		Time2 time = new Time2();
		time.setSecond(6);
		assertEquals(0,time.getHour());
		assertEquals(0,time.getMinute());
		assertEquals(6,time.getSecond());
	}
	
	@Test
	public void testToUniversalString() {
		Time2 timeAM = new Time2(1,2,3);
		Time2 timePM = new Time2(13,14,15);
		assertEquals("01:02:03",timeAM.toUniversalString());
		assertEquals("13:14:15",timePM.toUniversalString());
	}
	
	@Test
	public void testToString() {
		Time2 timeAM = new Time2(1,2,3);
		Time2 timePM = new Time2(13,14,15);
		assertEquals("1:02:03 AM",timeAM.toString());
		assertEquals("1:14:15 PM",timePM.toString());
	}
}
