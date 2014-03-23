package com.thoughtworks.legacycode.filemanager;

public class Main {

    public static void main(String[] args) throws PartitionDoesNotExistException {
        FileManager.init("Partition1", "Partition2");
        FileManager.run();
    }
}
