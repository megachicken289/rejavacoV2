package chapters.ch8.f_Enum_Class;

import chapters.ch8.f_Enum_Class.Book;
import org.junit.Ignore;
import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.assertEquals;

/**
 * Created by Frank Borges XPTHQ on 2/28/2018.
 */


// planned enhancement: parameterize test
public class EnumTest {
	@Test
	public void testEnum_Main() throws Exception {
		System.out.println("All Books:");
		
		// print all books in enum Book
		for (Book book : Book.values()) {
			System.out.printf("%-10s%-45s%s%n", book,
					book.getTitle(), book.getCopyrightYear()
			);
		}
		System.out.printf("%nDisplay a range of enum consts:%n");
		
		// print first four books
		for ( Book book: EnumSet.range(Book.JHTP, Book.CPPHTP)) {
			System.out.printf("%-10s%-45s%s%n", book,
				book.getTitle(),book.getCopyrightYear()
			);
		}
	}
	
	@Test
	public void testBookConstructorTitles() {
		assertEquals("Java How to Program", Book.JHTP.getTitle());
		assertEquals("C How to Program", Book.CHTP.getTitle());
		assertEquals("Internet & World Wide Web How to Program", Book.IW3HTP.getTitle());
		assertEquals("C++ How to Program", Book.CPPHTP.getTitle());
		assertEquals("Visual Basic How to Program", Book.VBHTP.getTitle());
		assertEquals("Visual C# How to Program", Book.CSHARPHTP.getTitle());
	}
	
	@Test
	public void testBookConstructorCopyrightYear() {
		assertEquals("2015", Book.JHTP.getCopyrightYear());
		assertEquals("2013", Book.CHTP.getCopyrightYear());
		assertEquals("2012", Book.IW3HTP.getCopyrightYear());
		assertEquals("2014", Book.CPPHTP.getCopyrightYear());
		assertEquals("2014", Book.VBHTP.getCopyrightYear());
		assertEquals("2014", Book.CSHARPHTP.getCopyrightYear());
	}
}
