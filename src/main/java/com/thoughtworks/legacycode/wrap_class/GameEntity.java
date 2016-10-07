package com.thoughtworks.legacycode.wrap_class;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public interface GameEntity {
    void processAi();

    void moveTo(GameEntity target);

    void draw();

    void moveTo(Vector2 position);

    Vector2 position();

    void decreaseHitPoints(Integer damage);

    String state();

    void position(Vector2 position);
}
