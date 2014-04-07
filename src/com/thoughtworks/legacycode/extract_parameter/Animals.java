package com.thoughtworks.legacycode.extract_parameter;

import com.thoughtworks.legacycode.remove_duplication.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThoughtWorker on 3/26/14.
 */
public class Animals {
    private static List<Animal> wild;

    public static List<Animal> wild() {
        if (wild == null){
            wild = new ArrayList<>();
        }
        return wild;
    }
}
