package com.thoughtworks.legacycode.spawn_class;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


//  Spawn Class
//
//  Introduce a new class for the test below and TDD a method on that class. Don't test that the new method is called by processAi
//  There is a hint in the Monster class

public class AiEntityTest {
    @Test
    public void shouldBecomeDeadWhenAtZeroOrFewerHitPoints() {
        int hitPoints = 0;
        Monster monster = new Monster(hitPoints, "Angry", new Vector2(0, 0));
        // Call new method here

        assertThat(monster.state(), is("Dead"));
    }
}