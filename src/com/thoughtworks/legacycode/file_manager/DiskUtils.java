package com.thoughtworks.legacycode.file_manager;

import java.io.File;

public class DiskUtils {
    private static DiskUtils instance = null;

    public void format(String input) {
        // code that formats a physical hard drive partition

    }

    public static DiskUtils getInstance() {
        if (instance == null){
            instance = new DiskUtils();
        }
        return instance;
    }

    public File getFile(String fn) {
        return new File(fn);
    }

    public void useDefragger(FileManager fm, Defragger defragger) throws PartitionDoesNotExistException {
        String pn = fm.input("Enter partition name");
        if (defragger.canDefrag(getPartition(pn))){

        }

    }

    private Partition getPartition(String n) throws PartitionDoesNotExistException {
        return new Partition(n);
    }

    public boolean canFindPartition(String n) {
        // Looks for partition on disk and returns true if it exists
        return false;
    }
    public boolean canFindFile(String n) {
        // Looks for file on disk and returns true if it exists
        return false;
    }
}
