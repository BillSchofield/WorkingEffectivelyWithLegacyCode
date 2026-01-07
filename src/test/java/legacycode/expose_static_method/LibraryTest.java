package legacycode.expose_static_method;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LibraryTest {
//  Expose Static Method

//  Change existing method to be static (if it can be). You can test without an instance

    @Test
    @Disabled
    public void shouldFindOverdueBooks() {
        List<Book> books = new ArrayList<Book>();
        Book book = new Book("Starship Troopers", true);
        books.add(book);

        // Test will pause here while waiting for user input
        Library library = new Library(System.console());

        // If overdueBooks was static we wouldn't have to create a new library
        List<Book> overdueBooks = library.overdueBooks(books);

        assertThat(overdueBooks).contains(book);
    }
}
