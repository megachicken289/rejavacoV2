package chapters.ch10.b_PayrollSysUsingPolymorphism;

/**
 * Created by Frank Borges XPTHQ on 3/7/2018.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // base salary per week
	
	public BasePlusCommissionEmployee(String firstName, String lastName,
	                                  String socialSecurityNumber, double grossSales,
	                                  double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// return baseSalary
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// set baseSalary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}
	
}
