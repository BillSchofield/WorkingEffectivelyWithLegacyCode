package com.thoughtworks.legacycode.remove_duplication;

/**
 * Created by ThoughtWorker on 3/24/14.
 */
public class Fish implements Animal{
    @Override
    public boolean likes(String thing) {
        return false;
    }

    @Override
    public String name() {
        return null;
    }
}
