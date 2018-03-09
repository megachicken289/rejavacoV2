package chapters.ch10.c_CreatingAndUsingInterfaces;

/**
 * Created by Frank Borges XPTHQ on 3/7/2018.
 */
public abstract class Employee implements Payable{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	protected Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// return FirstName
	public String getFirstName() {
		return firstName;
	}
	
	// return lastName
	public String getLastName() {
		return lastName;
	}
	
	// return socialSecurityNumber
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// calculate earnings; override abstract methjod earnings in Employee
	public abstract double getPaymentAmount();
	
	// return String rep of Employee object
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security nubmber: %s",
				getFirstName(),getLastName(),getSocialSecurityNumber());
	}
	
	// Note: We do not implement Payable method getPaymentAmount here so
	// this class must be declared abstract to avoid a compilation error
}
