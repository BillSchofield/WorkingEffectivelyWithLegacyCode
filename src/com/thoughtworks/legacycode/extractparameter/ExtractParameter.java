package com.thoughtworks.legacycode.extractparameter;

import com.thoughtworks.legacycode.duplication.Animal;

import java.util.ArrayList;
import java.util.List;

public class ExtractParameter {

    private Zoo zoo;
    private List<Enclosure> enclosures;

    public ExtractParameter() {
        zoo = new Zoo();
    }

    public int numberOfEnclosures(){
        if (enclosures == null){
            enclosures = new ArrayList<>();
        }
        return enclosures.size();
    }

    public void addEnclosure(Enclosure enclosure){
        if (enclosures == null){
            enclosures = new ArrayList<>();
        }
        enclosures.add(enclosure);
    }

    public void moveWildAnimalsToEnclosures(){
        for (Animal animal : Animals.wild()) {
            findEnclosureFor(animal).add(animal);
        }
        Animals.wild().clear();
    }

    private Enclosure findEnclosureFor(Animal animal) {
        if (enclosures == null){
            enclosures = new ArrayList<>();
        }
        for (Enclosure enclosure : enclosures) {
            if (enclosure.contains(animal)){
                return enclosure;
            }
        }
        for (Enclosure enclosure : enclosures) {
            if (enclosure.isEmpty()){
                return enclosure;
            }
        }
        return null;
    }
}
