package chapters.ch6;

public class MethodOverload {
	public static void main (String[] args) {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));
	}
	
	public static int square (int intVal) {
		System.out.printf("%nCalled square with int arg: %d%n", intVal);
		return intVal * intVal;
	}
	
	public static double square (double doubVal) {
		System.out.printf("%nCalled square with double arg: %f%n", doubVal);
		return doubVal * doubVal;
	}
}
