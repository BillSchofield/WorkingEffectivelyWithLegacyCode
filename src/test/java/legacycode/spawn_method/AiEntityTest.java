package legacycode.spawn_method;

import legacycode.primitivize_parameter.Vector2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//  Spawn Method
//
//  Introduce a method for the test below and TDD that method. Don't test that the new method is called by processAi
//  There is a hint in the Monster class

public class AiEntityTest {
    @Test
    @Disabled
    public void shouldBecomeDeadWhenAtZeroOrFewerHitPoints() {
        int hitPoints = 0;
        Monster monster = new Monster(hitPoints, "Angry", new Vector2(0, 0));
        // Call new method here

        assertThat(monster.state()).isEqualTo("Dead");
    }
}
