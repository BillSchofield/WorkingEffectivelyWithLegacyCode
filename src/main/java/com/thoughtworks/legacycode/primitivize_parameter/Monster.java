package com.thoughtworks.legacycode.primitivize_parameter;

public class Monster {

    private Physics physics = Physics.getInstance();
    private Rendering rendering = new Rendering();
    private Vector2 position;


    public Monster(Vector2 position) {
        this.position = position;
        physics.add(this);
        rendering.render(this);
    }

    public Vector2 position() {
        return position;
    }

    public void moveTo(Vector2 destination) {

    }
}
