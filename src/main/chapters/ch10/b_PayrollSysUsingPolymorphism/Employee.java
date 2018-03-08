package chapters.ch10.b_PayrollSysUsingPolymorphism;

/**
 * Created by Frank Borges XPTHQ on 3/7/2018.
 */
public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	protected Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// return String rep of Employee object
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security nubmber: %s",
				getFirstName(),getLastName(),getSocialSecurityNumber());
	}
	
	// abstract method must be overridden by concrete subclass
	public abstract double earnings(); // no implimentation here
}
