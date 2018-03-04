package chapters.ch8.h_StaticImport;

import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

/**
 * Created by Frank Borges XPTHQ on 3/1/2018.
 */
public class StaticImportTest {
	public static void main(String[] args) {
		System.out.printf("sqrt(900.00) = %.1f%n",sqrt(900.00));
		System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
		System.out.printf("E = %f%n", E);
		System.out.printf("PI = %f%n", PI);
	}
}
