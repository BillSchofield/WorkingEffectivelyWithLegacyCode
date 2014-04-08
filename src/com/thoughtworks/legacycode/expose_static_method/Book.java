package com.thoughtworks.legacycode.expose_static_method;

public class Book {
    private boolean overDue=false;
    private String name;

    public Book(String name) {

        this.name = name;
    }

    public boolean isOverDue() {
        return overDue;
    }
}
