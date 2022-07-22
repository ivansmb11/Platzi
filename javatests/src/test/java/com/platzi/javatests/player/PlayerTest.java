package com.platzi.javatests.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class PlayerTest {

    @Test
    public void testPlayerWins() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice, 3);
        assertEquals(true, player.play());
    }

    @Test
    public void testPlayerLoses() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(1);
        Player player = new Player(dice, 2);
        assertEquals(false, player.play());
    }
}
