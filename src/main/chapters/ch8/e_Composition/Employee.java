/*
 * Testing Composition
 */

package chapters.ch8.e_Composition;

/**
 * Created by Frank Borges XPTHQ on 2/26/2018.
 */
public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	// constructor to initialize name, birth date, and hire date
	
	public Employee (String firstName, String lastName, Date birthDate, Date hireDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}
	
	// convert Employee to String format
	
	
	@Override
	public String toString () {
		return String.format("%s, %s Hired: %s Birthday: %s",
				lastName,firstName,hireDate,birthDate);
	}
}
