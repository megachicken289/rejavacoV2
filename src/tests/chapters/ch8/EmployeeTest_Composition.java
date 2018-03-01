/*
 * Testing Composition
 */
package chapters.ch8;

import chapters.ch8.e_Composition.Date;
import chapters.ch8.e_Composition.Employee;
import org.junit.Test;

/**
 * Created by Frank Borges XPTHQ on 2/26/2018.
 */
public class EmployeeTest_Composition {
	@Test
	public void testEmployee () {
		Date birth = new Date(7,24,1949);
		Date hire  = new Date(3,12,1998);
		Employee employee = new Employee("Bob", "Blue", birth,hire);
		System.out.println(employee);
	}
}
