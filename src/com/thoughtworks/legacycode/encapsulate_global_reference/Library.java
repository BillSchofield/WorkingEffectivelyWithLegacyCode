package com.thoughtworks.legacycode.encapsulate_global_reference;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public void listBooks() {
        for (Book book : Main.BookList) {
            System.out.println(book.getName());
        }
    }

    public void listOverdueBooks() {
        List<Book> overdueBooks = new ArrayList<Book>();
        for (Book book : Main.BookList) {
            if (book.isOverDue()){
                overdueBooks.add(book);
            }
        }
        for (Book overdueBook : overdueBooks) {
            System.out.println(overdueBook.getName());
        }
    }
}