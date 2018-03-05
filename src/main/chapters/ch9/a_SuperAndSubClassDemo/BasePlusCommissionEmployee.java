package chapters.ch9.a_SuperAndSubClassDemo;

/**
 * Created by Frank Borges XPTHQ on 3/5/2018.
 */
public class BasePlusCommissionEmployee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	// six-args constructor
	public BasePlusCommissionEmployee(String firstName, String lastName,
	                                  String socialSecurityNumber, double grossSales,
	                                  double commissionRate, double baseSalary) {
		// implicit call to Object's default constructor occurs here
		
		// if grossSales is invalid throw exception
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		// if commissionRate is invalid, throw exception
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be 0% and 100%");
		
		// if commissionRate is invalid, throw exception
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
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
	
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross Sales must be >= 0.0");
		return grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be 0% and 100%");
		
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base Salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// calc earnings
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	
	// return String rep of CommissionEmployee obj
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
				"base-salary commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate,
				"base salary", baseSalary);
	}
}
