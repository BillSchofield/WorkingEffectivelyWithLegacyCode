package legacycode.wrap_class;

import legacycode.primitivize_parameter.Vector2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AiEntityTest {
//  Wrap Class aka Decorator

//  Wrap your hard to test class with a Decorator and TDD the decorator
//
//  Create a new class that implements the GameEntity interface and also 'has-a' GameEntity

    @Test
    @Disabled
    public void shouldBecomeDeadWhenAtZeroOrFewerHitPoints() {
        int hitPoints = 0;
        // Don't create an actual Monster here. Inject a mock GameEntity into your new decorator class
        GameEntity gameEntity = new Monster(hitPoints, "Angry", new Vector2(0, 0));

        gameEntity.processAi();

        assertThat(gameEntity.state()).isEqualTo("Dead");
    }
}
