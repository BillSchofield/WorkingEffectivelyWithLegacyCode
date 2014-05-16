package com.thoughtworks.legacycode.extract_and_override_call;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

// Extract and Override Call

// Extract tough dependency and override it then test child class

    @Test
    public void shouldPrintNameOfBookWhenThereIsOneBook() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Ringworld"));
        PrintStream printStream = mock(PrintStream.class);

        // Create instance of a new subclass of Library and call printBooks

        verify(printStream).println("Ringworld");
    }
}
