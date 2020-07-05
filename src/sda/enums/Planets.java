package sda.enums;

enum Size {
    SMALLEST("Smallest"),
    EARTHSIZE("Earth sized"),
    PERFECT("Perfect"),
    SMALLTOAVERAGE("Small to average"),
    GIANT("Giant"),
    HUGE("Huge"),
    BIGBLUE("BigBlue"),
    BIGCOLD("BigCold");

    String size;

    Size(String size) {
        this.size = size;
    }

    String getSize(){
        return this.size;
    }
}

public enum Planets {
    MERCURY(Size.SMALLEST.getSize(), "Mercury", 2),
    VENUS(Size.EARTHSIZE.getSize(), "Venus", 1),
    EARTH(Size.PERFECT.getSize(), "Earth", 0),
    MARS(Size.SMALLTOAVERAGE.getSize(), "Mars", 1),
    JUPITER(Size.GIANT.getSize(), "Jupiter", 2),
    SATURN(Size.HUGE.getSize(), "Saturn", 3),
    URANUS(Size.BIGBLUE.getSize(), "Uranus", 4),
    NEPTUNE(Size.BIGCOLD.getSize(), "Neptune", 5);

    String size;
    String name;
    int distanceFromEarth;

    Planets(String size, String name, int distanceFromEarth) {
        this.size = size;
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;
    }

    int distanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return size + " " + name;
    }
}
