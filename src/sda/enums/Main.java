package sda.enums;

public class Main {

    public static void main(String[] args) {
        Planets planet001 = Planets.MARS;
        Planets planet002 = Planets.URANUS;
        Planets planet003 = Planets.MERCURY;

        switchPlanets(planet001);
        switchPlanets(planet002);
        switchPlanets(planet003);
    }

    public static void switchPlanets(Planets planet) {
        switch (planet) {

            case MERCURY:
                printPlanetThings(planet);
                break;
            case VENUS:
                printPlanetThings(planet);
                break;
            case EARTH:
                printPlanetThings(planet);
                break;
            case MARS:
                printPlanetThings(planet);
                break;
            case JUPITER:
                printPlanetThings(planet);
                break;
            case SATURN:
                printPlanetThings(planet);
                break;
            case URANUS:
                printPlanetThings(planet);
                break;
            case NEPTUNE:
                printPlanetThings(planet);
                break;
        }
    }

    public static void printPlanetThings(Planets planet) {
        System.out.println(planet.toString());
        System.out.println("Distance from Earth: "
                + planet.distanceFromEarth());
        System.out.println();
    }
}
