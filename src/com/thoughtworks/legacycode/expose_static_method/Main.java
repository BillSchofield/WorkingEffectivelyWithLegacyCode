package com.thoughtworks.legacycode.expose_static_method;

import java.io.Console;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = asList(new Book("The Two Towers"), new Book("House of Leaves"));
        final Library library = new Library(System.console());
        library.printBooks(bookList);
        final List<Book> overdueBooks = library.overdueBooks(bookList);
        library.printBooks(overdueBooks);
    }
}
