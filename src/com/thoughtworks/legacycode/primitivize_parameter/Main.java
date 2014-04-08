package com.thoughtworks.legacycode.primitivize_parameter;

public class Main {
    public static void main(String[] args) {
        final Monster monster1 = new Monster(new Vector2(0, 0));
        final Monster monster2 = new Monster(new Vector2(10, 10));

        Vector2 goalLocation = findMidpoint(monster1, monster2);
        monster1.moveTo(goalLocation);
        monster2.moveTo(goalLocation);
    }

    public static Vector2 findMidpoint(Monster monster1, Monster monster2) {
        return monster1.position().average(monster2.position());
    }
}
