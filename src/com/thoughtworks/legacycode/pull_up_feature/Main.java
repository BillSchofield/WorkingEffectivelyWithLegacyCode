package com.thoughtworks.legacycode.pull_up_feature;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster(10, "Angry", new Vector2(0, 0));
        monster.processAi();monster.draw();

    }
}
