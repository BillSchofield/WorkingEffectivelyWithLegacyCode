package com.thoughtworks.legacycode.subclass_and_override_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Monster extends AiEntity {
    private Physics physics;
    private Rendering rendering;

    public Monster(Physics physics, Rendering rendering, Integer hitPoints, String state, Vector2 position) {
        super(hitPoints, state, position);
        this.physics = physics;
        this.rendering = rendering;
        this.physics.add(this);
        this.rendering.render(this);
    }

    public void moveTo(Vector2 position){
        this.position = position;
        physics.move(this, position);
    }

    public void draw(){
        rendering.render(this);
    }

    public AiEntity findNearestEnemy() {
        return physics.findNearestEntityTo(position);
    }

    public void moveTo(AiEntity target) {
        moveTo(target.position);
    }

}
