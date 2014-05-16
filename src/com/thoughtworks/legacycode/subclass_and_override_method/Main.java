package com.thoughtworks.legacycode.subclass_and_override_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster(new Physics(), new Rendering(), 10, "Angry", new Vector2(0, 0));
        monster.processAi();
        monster.draw();
    }
}
