package legacycode.subclass_and_override_method;

import legacycode.primitivize_parameter.Vector2;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AiEntityTest {

//  Subclass and Override Method

// Test a subclass of your real class and override methods with dependencies

    @Test
    public void shouldMoveToClosestEnemyWhenHealthy() {

        TestMonster monster = new TestMonster(10, "Angry", new Vector2(0, 0));
        monster.nearestEnemy = new TestMonster(10, "", new Vector2(1,1));
        monster.processAi();

        assertThat(monster.enemyWeMovedTo).isEqualTo(monster.nearestEnemy);
    }

}
