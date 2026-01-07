package legacycode.wrap_method;

import legacycode.primitivize_parameter.Vector2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AiEntityTest {
//Wrap Method
//  New method (wraps the existing method and the method that will contain our new behavior) * Don't test
//  |------- Existing Method (processAi) * Don't test
//  |------- Method we want to TDD (this is where we make the monster dead if it has zero or fewer hitPoints
// Introduce a method that contains an existing method and a call to you new method

    @Test
    @Disabled
    public void shouldBecomeDeadWhenFewerThan1HitPoints() {
        Integer hitPoints = 0;
        Monster monster = new Monster(hitPoints, "Angry", new Vector2(0, 0));

        // Call new method instead of processAi
        monster.processAi();

        assertThat(monster.state()).isEqualTo("DEAD");
    }

}
