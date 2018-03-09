package chapters.ch11.b_WhenToUseExceptioinHandling;

/**
 * Created by Frank Borges XPTHQ on 3/8/2018.
 */
public class UsingExceptions {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) { // exception thrown by throwException
			System.err.println("Exception handled in main ");
		}
		
		doesNotThrowException();
	}
	
	// demo try...catch...finally
	public static void throwException() throws Exception {
		try { // throw an exception and immediately catch it
			System.out.println("Method throwException");
			throw new Exception(); // generate exception
		} catch (Exception e) {
			System.err.println("Exception handled in method throwException");
			throw e; // rethrow for further processing
		}
			
			// code here would not be reached; would cause compilation errors
			
		finally { // executes regardless of what occurs in try...catch
			System.out.println("Finally executed in throwException");
		}
		
		// code here would not be reached; would cause compilation errors
		
	}
	
	// demo finally when no exception occurs
	public static void doesNotThrowException() {
		try {
			System.out.println("Method doesNotThrowException");
		} catch (Exception e) {
			System.err.println(e);
		} finally { // executes regardless of what occurs in try...catch
			System.err.println("Finally executed in doesNotThrowException");
		}
		
		System.out.println("End of method doesNotThrowException");
	}
}
