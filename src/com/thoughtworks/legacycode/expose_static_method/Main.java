package com.thoughtworks.legacycode.expose_static_method;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = asList(new Book("The Two Towers", true), new Book("House of Leaves", true));
        final Library library = new Library(System.console());
        library.printBooks(bookList);
        final List<Book> overdueBooks = library.overdueBooks(bookList);
        library.printBooks(overdueBooks);
    }
}
