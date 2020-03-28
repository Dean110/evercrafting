package org.wcci.evercraft.characters;

public class GameCharacter {
    private String name;
    private String alignment;

    public GameCharacter(String name, String alignment) {

        this.name = name;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public String getAlignment() {
        return alignment;
    }

    public void changeAlignment(String newAlignment) {
        alignment = newAlignment;
    }
}
