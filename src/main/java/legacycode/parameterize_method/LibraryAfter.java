package legacycode.parameterize_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class LibraryAfter {
    private PrintStream printStream;

    public LibraryAfter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printBooks(List<Book> books, BufferedReader bufferedReader) throws IOException {
        final String libraryName = bufferedReader.readLine();
        printStream.println(libraryName);
        for (Book book : books) {
            printStream.println(book.getName());
        }
    }
}
