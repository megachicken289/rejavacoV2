package chapters.ch8;

public class ThisTest {
	public static void main (String[] args) {
		SimpleTime time = new SimpleTime(15, 30, 19);
		SimpleTime timeCustom = new SimpleTime(23, 59, 59);
		System.out.println(time.buildString());
		System.out.println(timeCustom.buildString());
	}
}

// class SimpleTime demos the "this" ref
class SimpleTime {
	private int hour;   // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	// if the constructor uses parameter names identical to
	// instance variable names the "this" ref is required to
	// distinguish between the names
	public SimpleTime (int hour, int minute, int second) {
		// pretend "this" --> "time" // from line 9
		this.hour = hour;       // set "this" obj's hour
		this.minute = minute;   // set "this" obj's min
		this.second = second;   // set "this" obj's sec
	}
	
	// use explicit and implicit "this" to call toUniversalString
	public String buildString () {
		return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(),
				"toUniversalString()", toUniversalString());
	}
	
	// convert to String in universal-time formate (HH:MM:SS)
	public String toUniversalString () {
		// "this" is not req here to access instance variables,
		// because method does not have local variables w/ same
		// names as instance variables
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
}
