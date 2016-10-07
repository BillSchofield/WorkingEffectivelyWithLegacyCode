package com.thoughtworks.legacycode.parameterize_constructor;

import com.thoughtworks.legacycode.remove_duplication.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {
    private Zoo zoo;
    private List<Enclosure> enclosures;

    public ZooManager() {
        zoo = new Zoo();
    }

    public int numberOfEnclosures(){
        if (enclosures == null){
            enclosures = new ArrayList<Enclosure>();
        }
        return enclosures.size();
    }

    public void addEnclosure(Enclosure enclosure){
        if (enclosures == null){
            enclosures = new ArrayList<Enclosure>();
        }
        enclosures.add(enclosure);
    }

    public void moveWildAnimalsToEnclosures(){
        for (Animal animal : Animals.wild()) {
            findEnclosureFor(animal).add(animal);
        }
        Animals.wild().clear();
    }

    public Zoo getZoo() {
        return zoo;
    }

    private Enclosure findEnclosureFor(Animal animal) {
        if (enclosures == null){
            enclosures = new ArrayList<Enclosure>();
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
