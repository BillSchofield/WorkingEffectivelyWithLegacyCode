package legacycode.parameterize_constructor;

import legacycode.remove_duplication.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZooManagerAfter {
    private final List<Animal> animals;
    private Zoo zoo;
    private List<Enclosure> enclosures;


    public ZooManagerAfter(List<Animal> animals) {
        zoo = new Zoo();
        this.animals = animals;
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
        for (Animal animal : animals) {
            findEnclosureFor(animal).add(animal);
        }
        animals.clear();
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
