package chapters.ch9.a_SuperAndSubClassDemo;

/**
 * Created by Frank Borges XPTHQ on 3/5/2018.
 */
public class BasePlusCommissionEmployee_Fig94AndFig98_Extends extends CommissionEmployee_Fig94AndFig98 {
	private double baseSalary; // base salary per week
	
	// six-arg constructor
	public BasePlusCommissionEmployee_Fig94AndFig98_Extends(String firstName, String lastName, String socialSecurityNumber, double
			grossSales, double commissionRate, double baseSalary) {
		// explicitly call to superclass CommissionEmployee constructor
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		// if baseSalary is invalid throw exception
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
				"baseSalary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"baseSalary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public double earnings() {
		// (fig 9.7) not allowed: commissionRate and grossSales private in superclass
		return baseSalary + (commissionRate * grossSales);
//		return -99999;  //  added for postarity of above comments // (fig 9.7)
	}
	
	@Override
	public String toString() {
		// (fig 9.7) not allowed: attempts to access private superclass members
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
				"base-salary commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate,
				"base salary", baseSalary);
//		return "not valid";  //  added for postarity of above comments // (fig 9.7)
	}
}
