package chapters.ch8.g_StaticClassMembers;

/**
 * Created by Frank Borges XPTHQ on 2/28/2018.
 */
public class Employee {
	private static int count = 0;   // num of employees
	private String firstName;
	private String lastName;
	
	// init Employee. add 1 to static count and
	// output String indicating that constructor was called
	
	public Employee(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count; // incrment static count of employees
		System.out.printf("Employee constructor: %s %s; count = %d%n",
				firstName,lastName,count);
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
