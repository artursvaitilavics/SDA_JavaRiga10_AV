package sda.hmwork.enums.task03.enums;

import java.util.Scanner;

//1. Ask user to enter name of a planet (any case). E.g use can enter `Earth`, `earth`, `eArTh` - all should work
//2. Print all information about planet - Name, Relative size, Distance from earth
//3. Ask user to enter another planet name
//4. Print distance between these 2 planets, but don't print 0 if it is the same planet.
//5. Use switch to print:
//   1. `terrastrial planet` for Mercury, Venus, Earth, Mars
//   2. `gas giant` for Jupiter and Saturn
//   3. `ice giant` for Uranus and Neptune
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Planets planet01 = null;
        Planets planet02 = null;
        int wrong = 0;

        while (wrong == 0) {
            try {
                System.out.println("Please chose first planet: ");
                planet01 = Planets.valueOf(scanner.nextLine().toUpperCase());
                switchPlanets(planet01);
                wrong = 1;
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter planet from this solar system!");
            }
        }
        wrong = 0;

        while (wrong == 0) {
            try {
                System.out.println("Please chose second planet: ");
                planet02 = Planets.valueOf(scanner.nextLine().toUpperCase());
                switchPlanets(planet02);
                wrong = 1;
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter planet from this solar system!");
            }
        }


        int distanceBetweenPlanets =
                planet01.distanceFromEarth - planet02.distanceFromEarth;

        isPrintable(distanceBetweenPlanets);
    }

    public static void isPrintable(int distanceBetweenPlanets) {
        if (distanceBetweenPlanets > 0) {
            System.out.println(distanceBetweenPlanets);
        } else if (distanceBetweenPlanets < 0) {
            System.out.println(-1 * distanceBetweenPlanets);
        }
    }

    public static void switchPlanets(Planets planet) {
        switch (planet) {

            case MERCURY:
                printPlanetThings(planet);
                System.out.println("terrastrial planet");
                break;
            case VENUS:
                printPlanetThings(planet);
                System.out.println("terrastrial planet");
                break;
            case EARTH:
                printPlanetThings(planet);
                System.out.println("terrastrial planet");
                break;
            case MARS:
                printPlanetThings(planet);
                System.out.println("terrastrial planet");
                break;
            case JUPITER:
                printPlanetThings(planet);
                System.out.println("gas giant");
                break;
            case SATURN:
                printPlanetThings(planet);
                System.out.println("gas giant");
                break;
            case URANUS:
                printPlanetThings(planet);
                System.out.println("ice giant");
                break;
            case NEPTUNE:
                printPlanetThings(planet);
                System.out.println("ice giant");
                break;
        }
    }

    public static void printPlanetThings(Planets planet) {
        System.out.println(planet.toString());
        System.out.println("Distance from Earth: "
                + planet.distanceFromEarth());
//        System.out.println();
    }
}
