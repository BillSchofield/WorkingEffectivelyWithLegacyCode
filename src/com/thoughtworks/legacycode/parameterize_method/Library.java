package com.thoughtworks.legacycode.parameterize_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;

public class Library {
    private PrintStream printStream;

    public Library(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printBooks(List<Book> books) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final String libraryName = bufferedReader.readLine();
        printStream.println(libraryName);
        for (Book book : books) {
            printStream.println(book);
        }
    }
}
