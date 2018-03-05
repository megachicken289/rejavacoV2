package chapters.ch9.a_SuperAndSubClassDemo;

/**
 * Created by Frank Borges XPTHQ on 3/5/2018.
 */
public class BasePlusCommissionEmployeeTest{
	public static void main(String[] args) {
		// instantiate BasePlusCommissionEmployee object
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333",
				5000,.04,300);
		
		// get base-salary commission employee data
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
		System.out.printf("%s %.2f%n", "Base Salary is",
				employee.getBaseSalary());

		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n",
				"Update employee info obtained by toString", employee);
	}
	
}
