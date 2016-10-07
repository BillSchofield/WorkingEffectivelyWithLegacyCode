package com.thoughtworks.legacycode.expose_static_method;

public class Book {
    private boolean overDue;
    private String name;

    public Book(String name, boolean overdue) {
        this.name = name;
        this.overDue = overdue;
    }

    public boolean isOverDue() {
        return overDue;
    }

    public String getName() {
        return name;
    }
}
