package com.thoughtworks.legacycode.wrap_class;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Physics {
    private Monster monster;

    public static Physics getInstance() {
        return null;
    }

    public void add(Monster monster) {
        this.monster = monster;
    }

    public void move(Monster entity, Vector2 position) {
        entity.position(position);

    }
}
