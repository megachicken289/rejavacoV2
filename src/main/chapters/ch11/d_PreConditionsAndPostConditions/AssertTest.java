package chapters.ch11.d_PreConditionsAndPostConditions;

import java.util.Scanner;

/**
 * Created by Frank Borges XPTHQ on 3/8/2018.
 */
public class AssertTest {
	
	
	/**
	 * NOTE: If this doesn't work properly,
	 * add the following VM arguments (without quotes)
	 * -ea
	 */
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 10: ");
		int number = input.nextInt();
		
		// assert that the value is >= 0 and <= 10:
		assert (number >= 0 && number <= 10) : "Bad number: " + number;
		
		System.out.printf("You entered %d%n", number);
	}
}
