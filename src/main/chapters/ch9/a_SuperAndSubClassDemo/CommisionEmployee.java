package chapters.ch9.a_SuperAndSubClassDemo;

/**
 * Created by Frank Borges XPTHQ on 3/4/2018.
 */
public class CommisionEmployee extends Object{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;  // gross weekly sales
	private double commissionRate; // commission percentage
	
	public CommisionEmployee(String firstName, String lastName,
	                         String socialSecurityNumber, double grossSales,
	                         double commissionRate) {
		
		// implicitly call to Object's default constructor occurs here
		
		// if gross sales is invalid, throw execption
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		// if commissionRate is invalid, throw exception
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be 0% and 100%");
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
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
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross Sales must be >= 0.0");
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {
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
	
	// calc earnings
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	// return String rep of CommissionEmployee obj
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate);
	}
}
