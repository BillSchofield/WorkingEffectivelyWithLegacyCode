package com.thoughtworks.legacycode.exercise;

public class Main {

    public static void main(String[] args) throws PartitionDoesNotExistException {
        String[] partitions = {"Partition1", "Partition2"};
        FileManager.init(partitions);
        FileManager.run();
    }
}
