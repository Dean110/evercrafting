package org.wcci.evercraft.characters;

public class GameCharacter {
    private String name;
    private Alignment alignment;

    public GameCharacter(String name, Alignment alignment) {

        this.name = name;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void changeAlignment(Alignment newAlignment) {
        alignment = newAlignment;
    }
}
