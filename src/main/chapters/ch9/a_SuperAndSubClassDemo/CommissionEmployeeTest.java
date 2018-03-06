package chapters.ch9.a_SuperAndSubClassDemo;

/**
 * Created by Frank Borges XPTHQ on 3/4/2018.
 */
public class CommissionEmployeeTest {
	public static void main(String[] args) {
		CommissionEmployee_Fig94AndFig98 employee = new CommissionEmployee_Fig94AndFig98(
				"Sue", "Jones",
				"222-22-222", 10000,.06);
		
		
		// get commission employee data
		System.out.println("Employee info obtained by get methods");
		System.out.printf("%n%s %s%n", "First name is",
				employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is",
				employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is",
				employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross Sale is",
				employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is",
				employee.getCommissionRate());
		
		employee.setGrossSales(5000);
		employee.setCommissionRate(.1);
		
		System.out.printf("%n%s:%n%n%s%n",
				"Update employee info obtained by toString", employee);
	}
}
