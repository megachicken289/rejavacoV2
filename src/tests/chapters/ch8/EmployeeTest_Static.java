package chapters.ch8;

import chapters.ch8.g_StaticClassMembers.Employee;
import org.junit.Test;

/**
 * Created by Frank Borges XPTHQ on 2/28/2018.
 */
public class EmployeeTest_Static {
	@Test
	public void testEmployee_Main() {
		// show that count is 0 before creating Employees
		System.out.printf("Employees before instantiation: %d%n", Employee.getCount());
		
		// create two Employees; count should be 2
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Blue");
		
		// show that count is  2 after creating two Employees
		System.out.printf("%nEmployees after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee.getCount():%d%n",
				Employee.getCount());
		
		// get names of Employees
		System.out.printf("%nEmployee1: %s %s%nEmplyee 2: %s %s%n",
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());
	}
}
