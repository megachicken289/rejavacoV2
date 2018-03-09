package chapters.ch10.b_PayrollSysUsingPolymorphism;

/**
 * Created by Frank Borges XPTHQ on 3/7/2018.
 */
public class CommissionEmployee extends Employee {
	private double grossSales;      // gross weekly sales
	private double commissionRate;  // commission percentage
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
	                          double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		
		if (grossSales < 0.0) // validate
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	// return grossSales
	public double getGrossSales() {
		return grossSales;
	}
	
	// set grossSales
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) // validate
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}
	
	// return commissionRate
	public double getCommissionRate() {
		return commissionRate;
	}
	
	// set commissionRate
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%, .2f; %s: %,.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
}
