package com.thoughtworks.legacycode.filemanager;

/**
 * Created by ThoughtWorker on 3/23/14.
 */
public class Partition {
    public Partition(String n) throws PartitionDoesNotExistException {
        if (!DiskUtils.getInstance().canFindPartition(n)){
            throw new PartitionDoesNotExistException();
        }
        // initialize partition
    }
}
