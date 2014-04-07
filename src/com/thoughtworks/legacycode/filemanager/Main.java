package com.thoughtworks.legacycode.filemanager;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws PartitionDoesNotExistException {
        String[] partitions = {"Partition1", "Partition2"};
        FileManager.init(partitions);
        FileManager.run();
    }
}
