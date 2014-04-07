package com.thoughtworks.legacycode.encapsulate_global_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Book> BookList = Arrays.asList(new Book("The Two Towers"), new Book("House of Leaves"));

    public static void main(String[] args) {
        for (Book book : BookList) {
            System.out.println(book);
        }
        List<Book> overdueBooks = new ArrayList<>();
        for (Book book : BookList) {
            if (book.isOverDue()){
                overdueBooks.add(book);
            }
        }
        for (Book overdueBook : overdueBooks) {
            System.out.println(overdueBook);
        }
    }
}
