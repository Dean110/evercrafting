package org.wcci.evercraft.characters;

public class GameCharacter {
    private String name;

    public GameCharacter(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        name = newName;
    }
}
