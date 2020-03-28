package org.wcci.evercraft.characters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameCharacterTest {

    private GameCharacter underTest;

    @BeforeEach
    void setUp() {
        underTest = new GameCharacter("Bob");
    }

    @Test
    public void characterShouldHaveAName() {
        assertThat(underTest.getName()).isEqualTo("Bob");
    }


}
