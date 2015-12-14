package com.thoughtworks.legacycode.subclass_and_override_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AiEntityTest {

//  Subclass and Override Method

// Test a subclass of your real class and override methods with dependencies

    @Test
    public void shouldMoveToClosestEnemyWhenHealthy() {

        TestMonster monster = new TestMonster(10, "Angry", new Vector2(0, 0));
        monster.nearestEnemy = new TestMonster(10, "", new Vector2(1,1));
        monster.processAi();

        assertThat(monster.enemyWeMovedTo, is(monster.nearestEnemy));
    }

}
