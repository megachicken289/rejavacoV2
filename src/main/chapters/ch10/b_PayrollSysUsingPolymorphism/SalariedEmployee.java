package chapters.ch10.b_PayrollSysUsingPolymorphism;

/**
 * Created by Frank Borges XPTHQ on 3/7/2018.
 */
public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	// constructor
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must by >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	// set weeklySalary
	public void setWeeklySalary(double weeklySalary) {
		
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must by >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	// return weeklySalary
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	// calculate earnings; override abstract methjod earnings in Employee
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	// return String rep of SalariedEmployee obj
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f",
				super.toString(), "weekly salary", getWeeklySalary());
	}
}
