package org.wcci.evercraft.characters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameCharacterTest {

    private GameCharacter underTest;

    @BeforeEach
    void setUp() {
        underTest = new GameCharacter("Bob", "GOOD");
    }

    @Test
    public void characterShouldHaveAName() {
        assertThat(underTest.getName()).isEqualTo("Bob");
    }

    @Test
    public void characterShouldBeAbleToChangeName() {
        underTest.changeName("Joe");
        assertThat(underTest.getName()).isEqualTo("Joe");
    }

    @Test
    public void characterShouldHaveAnAlignment() {
        assertThat(underTest.getAlignment()).isEqualTo("GOOD");
    }

    @Test
    public void characterShouldBeAbleToChangeAlignment() {
        underTest.changeAlignment("EVIL");
        assertThat(underTest.getAlignment()).isEqualTo("EVIL");
    }

}
