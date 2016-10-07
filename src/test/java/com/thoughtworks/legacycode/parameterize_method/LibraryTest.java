package com.thoughtworks.legacycode.parameterize_method;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {
//  Parameterize Method
//  Inject a dependency instead of leaving it internal to a method
//
//  Break the dependency on BufferedReader by injecting it into the method

    @Test
    public void shouldPrintTheBookNameWhenThereIsOneBook() throws IOException {
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("House of Leaves"));

        library.printBooks(books);

        verify(printStream).println("House of Leaves");
    }
}
