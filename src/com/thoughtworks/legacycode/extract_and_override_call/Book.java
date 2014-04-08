package com.thoughtworks.legacycode.extract_and_override_call;

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
