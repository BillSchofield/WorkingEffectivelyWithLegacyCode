package com.thoughtworks.legacycode.expose_static_method;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private final String libraryName;

    public Library(Console console) {
        libraryName = console.readLine();
    }

    public void printBooks(List<Book> books) {
        System.out.println(libraryName);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> overdueBooks(List<Book> books) {
        List<Book> overdueBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.isOverDue()){
                overdueBooks.add(book);
            }
        }
        return overdueBooks;
    }
}
