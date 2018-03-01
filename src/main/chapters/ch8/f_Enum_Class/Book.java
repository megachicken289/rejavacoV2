package chapters.ch8.f_Enum_Class;

/**
 * Created by Frank Borges XPTHQ on 2/27/2018.
 */
public enum Book {
	// declare constances of enum type
	JHTP("Java How to Program", "2015"),
	CHTP("C How to Program", "2013"),
	IW3HTP("Internet & World Wide Web How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");
	
	// instance fields
	private final String title; // book title
	private final String copyrightYear; // copyright  year
	
	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	// accessor for field title
	public String getTitle() {
		return title;
	}
	
	// accessor for field copyrightYeare
	public String getCopyrightYear() {
		return copyrightYear;
	}
}
