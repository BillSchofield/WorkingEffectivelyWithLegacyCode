package com.thoughtworks.legacycode.wrap_class;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AiEntityTest {
//  Wrap Class aka Decorator

//  Wrap your hard to test class with a Decorator and TDD the decorator
//
//  Create a new class that implements the GameEntity interface and also 'has-a' GameEntity

    @Test
    public void shouldBecomeDeadWhenAtZeroOrFewerHitPoints() {
        int hitPoints = 0;
        // Don't create an actual Monster here. Inject a mock GameEntity into your new decorator class
        GameEntity gameEntity = new Monster(hitPoints, "Angry", new Vector2(0, 0));

        gameEntity.processAi();

        assertThat(gameEntity.state(), is("Dead"));
    }
}
