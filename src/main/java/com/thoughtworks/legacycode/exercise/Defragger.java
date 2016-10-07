package com.thoughtworks.legacycode.exercise;

public class Defragger {
    private String[] p;

    public Defragger(String[] p) {
        this.p = p;
    }

    public boolean canDefrag(Partition p) {
        for(String n : this.p){
            if (n.equals(p)){
                return true;
            }
        }
        return false;
    }
}
