package chapters.ch8;

import chapters.ch8.f_Enum_Class.Book;
import org.junit.Test;

import java.util.EnumSet;

/**
 * Created by Frank Borges XPTHQ on 2/28/2018.
 */
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
}
