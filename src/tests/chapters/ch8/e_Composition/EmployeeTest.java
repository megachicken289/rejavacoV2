package chapters.ch8.e_Composition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Frank Borges XPTHQ on 3/11/2018.
 */
public class EmployeeTest {
	@Test
	public void testEmployee_Main() {
		Date birth = new Date(7,24,1949);
		Date hire  = new Date(3,12,1998);
		Employee employee = new Employee("Bob", "Blue", birth,hire);
		System.out.println(employee);
	}
	
	@Test
	public void testEmployeeConstructor() {
		Employee employee = new Employee(
				"Frank",
				"Borges",
				new Date(7,16,1990),
				new Date(9,18,2019)
		);
		
		assertEquals(
				"Borges, Frank Hired: 9/18/2019 Birthday: 7/16/1990",
				employee.toString()
		);
	}
}
