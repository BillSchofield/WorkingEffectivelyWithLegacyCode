package com.thoughtworks.legacycode.extract_and_override_call;

import java.io.PrintStream;
import java.util.List;

public class Library {
    private PrintStream printStream;

    public Library(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printBooks(List<Book> books) {
        final String libraryName = System.console().readLine();
        printStream.println(libraryName);
        for (Book book : books) {
            printStream.println(book);
        }
    }
}
