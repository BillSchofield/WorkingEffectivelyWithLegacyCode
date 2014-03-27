package com.thoughtworks.legacycode.duplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplication {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal fish = new Fish();
        animals.addAll(Arrays.asList(cat, dog, fish));

        String command = "command";
        switch(command){
            case "swims":
                for (Animal animal : animals) {
                    if (animal.likes("water")){
                        System.out.println(animal.name() + "likes water.");
                    }
                }
                break;
            case "2":
                for (Animal animal : animals) {
                    if (animal.likes("running")){
                        System.out.println(animal.name() + "likes running.");
                    }
                }
                break;
            case "3":
                int indexOfCat = animals.lastIndexOf(cat);
                animals.add(indexOfCat, new Cat());
                break;
            case "4":
                animals.add(animals.lastIndexOf(dog), new Dog());
                break;
            case "5":
                animals.add(animals.lastIndexOf(fish), new Fish());
                break;
        }
    }
}
