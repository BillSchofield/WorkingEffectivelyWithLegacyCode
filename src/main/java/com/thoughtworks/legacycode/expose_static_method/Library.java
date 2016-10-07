package com.thoughtworks.legacycode.expose_static_method;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String libraryName;

    public Library(Console console) {
        // We need to avoid calling this line in our tests. So we need to not call the constructor
        libraryName = console.readLine();
    }

    public void printBooks(List<Book> books) {
        System.out.println(libraryName);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Make this static so you can test it without instantiating Library
    public List<Book> overdueBooks(List<Book> bookList) {
        List<Book> overdueBooks = new ArrayList<Book>();
        for (Book book : bookList) {
            if (book.isOverDue()){
                overdueBooks.add(book);
            }
        }
        return overdueBooks;
    }
}
