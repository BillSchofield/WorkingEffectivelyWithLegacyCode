package com.thoughtworks.legacycode.break_out_method_object;

public class Main {
    public static void main(String[] args) {
        new Monster(new Physics(), new Rendering(), 10, "Angry").processAi();
    }
}
