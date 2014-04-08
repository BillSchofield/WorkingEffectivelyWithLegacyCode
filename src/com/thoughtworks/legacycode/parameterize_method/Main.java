package com.thoughtworks.legacycode.parameterize_method;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = asList(new Book("The Two Towers"), new Book("House of Leaves"));
        final Library library = new Library(System.out);
        library.printBooks(bookList);
    }
}
