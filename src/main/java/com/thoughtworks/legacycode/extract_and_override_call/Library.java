package com.thoughtworks.legacycode.extract_and_override_call;

import java.io.PrintStream;
import java.util.List;

public class Library {
    private PrintStream printStream;

    public Library(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printBooks(List<Book> books) {

        // Extract this line into a protected method and override it in an new subclass
        final String libraryName = System.console().readLine();

        printStream.println(libraryName);
        for (Book book : books) {
            printStream.println(book.getName());
        }
    }
}
