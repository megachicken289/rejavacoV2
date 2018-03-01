package chapters.ch8.e_Composition;

/**
 * Created by Frank Borges XPTHQ on 2/27/2018.
 */
public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Date birth = new Date(7,24,1949);
		Date hire  = new Date(3,12,1998);
		Employee employee = new Employee("Bob", "Blue", birth,hire);
		System.out.println(employee);
	}
}
