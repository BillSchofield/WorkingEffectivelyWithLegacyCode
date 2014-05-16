package com.thoughtworks.legacycode.spawn_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//  Spawn Method
//
//  Introduce a method for the test below and TDD that method. Don't test that the new method is called by processAi
//  There is a hint in the Monster class

public class MonsterTest {
    @Test
    public void shouldBecomeDeadWhenAtZeroOrFewerHitPoints() {
        int hitPoints = 0;
        Monster monster = new Monster(hitPoints, "Angry", new Vector2(0, 0));
        // Call new method here

        assertThat(monster.state(), is("Dead"));
    }
}
