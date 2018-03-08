package chapters.ch10.a_DemoPolymorphicBehavior;

import chapters.ch9.a_SuperAndSubClassDemo.BasePlusCommissionEmployee_Fig910_Extends;
import chapters.ch9.a_SuperAndSubClassDemo.CommissionEmployee_Fig910;

/**
 * Created by Frank Borges XPTHQ on 3/5/2018.
 */
public class PolymorphTest {
	public static void main(String[] args) {
		// assign superclass ref to superclass var
		CommissionEmployee_Fig910 commissionEmployee = new CommissionEmployee_Fig910(
				"Sue", "Jones", "222-22-2222",10000,.06);
		
		// assign subclass ref to subclass var
		BasePlusCommissionEmployee_Fig910_Extends basePlusCommissionEmployee =
				new BasePlusCommissionEmployee_Fig910_Extends(
						"Bob", "Lewis", "333-33-3333",
						5000,.04,300);
		
		// invoke toString on superclass obj using superclass var
		System.out.printf("%s %s:%n%n%s%n%n",
				"Call CommissionEmployee's toString with superclass reference ",
				"to superclass object", commissionEmployee.toString());
		
		// invoke toString on subclass obj using subclass var
		System.out.printf("%s %s:%n%n%s%n%n",
				"Call BasePlusCommissionEmployee's toString with subclass reference ",
				"to subclass object", basePlusCommissionEmployee.toString());
		
		// invoke toString on subclass object using superclass var
		CommissionEmployee_Fig910 commissionEmployee2 = basePlusCommissionEmployee;
		System.out.printf("%s %s:%n%n%s%n%n",
				"Call BasePlusCommissionEmployee's toString with subclass reference ",
				"to subclass object", commissionEmployee2.toString());
		
	}
}
