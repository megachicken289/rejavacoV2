package chapters.ch11.a_DivideByZeroWithoutExceptionHandling;

import java.util.Scanner;

/**
 * Created by Frank Borges XPTHQ on 3/8/2018.
 */
public class DivideByZeroNoExceptionHandling {
	// demo throwing an exception when a divide-by-zero occors
	public static int quotient(int numerator, int denominator) {
		return numerator / denominator; // possible division by zero
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter int numerator: ");
		int numerator = scanner.nextInt();
		System.out.print("Please enter int denominator: ");
		int denominator = scanner.nextInt();
		
		int res = quotient(numerator, denominator);
		System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator,res);
	}
}
