package chapters.ch11.a_DivideByZeroWithoutExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Frank Borges XPTHQ on 3/8/2018.
 */
public class DivideByZeroExceptionHandling {
	public static int quotient(int numerator, int denominator) {
		return numerator / denominator; // possible division by zero
	}
	
	public static void main(String[] args) throws ArithmeticException  {
		Scanner scanner = new Scanner(System.in);
		boolean contLoop = true;
		
		do {
			try {
				System.out.print("Please enter int numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter int denominator: ");
				int denominator = scanner.nextInt();
				
				int res = quotient(numerator, denominator);
				System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator,res);
				
				contLoop = false;   // input successful; end loop
			} catch (InputMismatchException e) {
				System.err.printf("%nException: %s%n", e);
				scanner.nextLine(); // discard input so user can try again
				System.out.printf("You must enter integers. Please try again.%n%n");
			} catch (ArithmeticException e) {
				System.err.printf("%nException: %s%n", e);
				System.out.printf("Zero is an invalid denominator. Plfease try again.%n%n");
			}
		} while (contLoop);
	}
}
