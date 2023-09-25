package org.example;

public enum Stage {
    BATTLEFIELD("Battlefield"),
    FD("Final Destination"),
    FOUNTAIN("Fountain of Dreams"),
    YOSHIS("Yoshi's Story"),
    DREAM_LAND_64("Dream Land 64"),
    POKEMON_STADIUM("Pokémon Stadium"),

    ICE_MOUNTAIN("Ice Mountain"),
    CORNERIA("Corneria"),
    VENOM("Venom"),
    PEACHS_CASTLE("Princess Peach's Castle"),
    RAINBOW_CRUISE("Rainbow Cruise"),
    MUSHROOM_KINGDOM("Mushroom Kingdom"),
    MUSHROOM_KINGDOM_2("Mushroom Kingdom II"),
    TEMPLE("Temple"),
    GREAT_BAY("Great Bay"),
    MUTE_CITY("Mute City"),
    BIG_BLUE("Big Blue"),
    GREEN_GREENS("Green Greens"),
    POKE_FLOATS("Poké Floats"),
    KONGO_FALLS("Kongo Falls"),
    JUNGLE_JAPES("Jungle Japes"),
    KONGO_JUNGLE_64("Kongo Jungle 64"),
    YOSHIS_ISLAND("Yoshi's Island"),
    YOSHIS_ISLAND_64("Yoshi's Island 64"),
    BRINSTAR("Brinstar"),
    BRINSTAR_DEPTHS("Brinstar Depths"),
    ONETT("Onett"),
    FOURSIDE("Fourside"),
    FLAT_ZONE("Flat Zone");

    private final String name;

    Stage(String name) {
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
