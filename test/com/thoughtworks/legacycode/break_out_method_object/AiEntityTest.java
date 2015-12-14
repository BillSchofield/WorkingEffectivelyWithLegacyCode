package com.thoughtworks.legacycode.break_out_method_object;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//  Break out Method Object

//  Extract method you want to change into a new class and test that
//  There is a hint in the Monster class

public class AiEntityTest {
    @Test
    public void shouldBecomeDeadWhenAtZeroOrFewerHitPoints() {
        Monster monster = mock(Monster.class);
        when(monster.hitPoints()).thenReturn(0);

        // Call method in new method object here

        verify(monster).state("");
    }
}
