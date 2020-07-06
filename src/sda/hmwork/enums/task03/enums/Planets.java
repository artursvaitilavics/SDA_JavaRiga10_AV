package sda.hmwork.enums.task03.enums;

enum Size {
    SMALLEST("Smallest"),
    EARTH_SIZE("Earth sized"),
    PERFECT("Perfect"),
    SMALL_TO_AVERAGE("Small to average"),
    GIANT("Giant"),
    HUGE("Huge"),
    BIGBLUE("BigBlue"),
    BIGCOLD("BigCold");

    String size;

    Size(String size) {
        this.size = size;
    }

    String getSize() {
        return this.size;
    }
}

enum Type {
    TERRESTRIAL_PLANET("Terrastrial planet"),
    GASS_GIANT("Gass giant"),
    ICE_GIANT("Ice giant");

    String name;

    Type(String name) {
        this.name = name;
    }
}

public enum Planets {
    MERCURY(Size.SMALLEST, "Mercury", 2, Type.TERRESTRIAL_PLANET),
    VENUS(Size.EARTH_SIZE, "Venus", 1, Type.TERRESTRIAL_PLANET),
    EARTH(Size.PERFECT, "Earth", 0, Type.TERRESTRIAL_PLANET),
    MARS(Size.SMALL_TO_AVERAGE, "Mars", 1, Type.TERRESTRIAL_PLANET),
    JUPITER(Size.GIANT, "Jupiter", 2, Type.TERRESTRIAL_PLANET),
    SATURN(Size.HUGE, "Saturn", 3, Type.TERRESTRIAL_PLANET),
    URANUS(Size.BIGBLUE, "Uranus", 4, Type.TERRESTRIAL_PLANET),
    NEPTUNE(Size.BIGCOLD, "Neptune", 5, Type.TERRESTRIAL_PLANET);

    Size size;
    String name;
    Type type;
    int distanceFromEarth;

    Planets(Size size, String name, int distanceFromEarth, Type type) {
        this.size = size;
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;
        this.type = type;
    }

    int distanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return size + " " + name;
    }
}
