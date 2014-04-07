package com.thoughtworks.legacycode.extract_parameter;

import com.thoughtworks.legacycode.remove_duplication.Animal;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    private static List<Animal> wild;

    public static List<Animal> wild() {
        if (wild == null){
            wild = new ArrayList<>();
        }
        return wild;
    }
}
