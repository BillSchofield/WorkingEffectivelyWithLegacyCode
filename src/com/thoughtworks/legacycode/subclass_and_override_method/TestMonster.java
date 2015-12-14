package com.thoughtworks.legacycode.subclass_and_override_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class TestMonster extends AiEntity {
    public AiEntity nearestEnemy;
    public AiEntity enemyWeMovedTo;

    public TestMonster(Integer hitPoints, String state, Vector2 position) {
        super(hitPoints, state, position);
    }

    @Override
    public AiEntity findNearestEnemy() {
        return nearestEnemy;
    }

    @Override
    public void moveTo(AiEntity target) {
        enemyWeMovedTo = target;
    }

    @Override
    public void draw() {

    }

    @Override
    public void moveTo(Vector2 position) {

    }

}
