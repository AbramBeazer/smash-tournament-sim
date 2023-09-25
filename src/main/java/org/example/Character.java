package org.example;

public enum Character {
    DOCTOR_MARIO("Dr. Mario"),
    MARIO("Mario"),
    LUIGI("Luigi"),
    BOWSER("Bowser"),
    PEACH("Peach"),
    YOSHI("Yoshi"),
    DK("Donkey Kong"),
    C_FALCON("Captain Falcon"),
    GANONDORF("Ganondorf"),
    FALCO("Falco"),
    FOX("Fox"),
    NESS("Ness"),
    ICE_CLIMBERS("Ice Climbers"),
    KIRBY("Kirby"),
    SAMUS("Samus"),
    ZELDA("Zelda"),
    SHEIK("Sheik"),
    LINK("Link"),
    YOUNG_LINK("Young Link"),
    PICHU("Pichu"),
    PIKACHU("Pikachu"),
    JIGGLYPUFF("Jigglypuff"),
    MEWTWO("Mewtwo"),
    MR_G_AND_W("Mr. Game & Watch"),
    MARTH("Marth"),
    ROY("Roy");

    private final String name;

    Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
