package com.thoughtworks.legacycode.parameterize_constructor;

import org.junit.Test;

public class ZooManagerTest {
// Parameterize Constructor
// Inject a dependency instead of leaving it internal to a class
//
// Break the dependencies on Animals.wild() and internally initialized enclosures so you can set them up properly for
// this test case and verify the correct results


    @Test
    public void shouldPlaceAnimalInTheSameCageAsAlreadyCagedAnimalOfTheSameType() {
        ZooManager zooManager = new ZooManager();
        zooManager.moveWildAnimalsToEnclosures();
        // assert or verify that the new animal ended up in the correct enclosure
    }

    @Test
    public void shouldPlaceAllWildAnimals() {
        ZooManager zooManager = new ZooManager();
        zooManager.moveWildAnimalsToEnclosures();
        // assert or verify that there are no wild animals left
    }
}
