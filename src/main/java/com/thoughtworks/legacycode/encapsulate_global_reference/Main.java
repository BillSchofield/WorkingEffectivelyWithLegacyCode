package com.thoughtworks.legacycode.encapsulate_global_reference;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Book> BookList = Arrays.asList(new Book("The Two Towers"), new Book("House of Leaves"));

    public static void main(String[] args) {
        Library library = new Library();
        library.listBooks();
        library.listOverdueBooks();
    }
}
