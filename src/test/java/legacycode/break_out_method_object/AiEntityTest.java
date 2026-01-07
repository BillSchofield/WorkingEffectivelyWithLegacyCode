package legacycode.break_out_method_object;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

//  Break out Method Object

//  Extract method you want to change into a new class and test that
//  There is a hint in the Monster class

public class AiEntityTest {
    @Test
    @Disabled
    public void shouldBecomeDeadWhenAtZeroOrFewerHitPoints() {
        Monster monster = mock(Monster.class);
        when(monster.hitPoints()).thenReturn(0);

        // Call method in new method object here

        verify(monster).state("");
    }
}
