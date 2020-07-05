package sda.hmwork.enums.taks01;

public class Main {
    public static void main(String[] args) {
        LengthUnit lengthUnit;

        double conversion1 = LengthUnit.MILLIMETER.convert(2, LengthUnit.MILLIMETER);
        double conversion2 = LengthUnit.CENTIMETER.convert(2, LengthUnit.MILLIMETER);
        double conversion3 = LengthUnit.METER.convert(2, LengthUnit.MILLIMETER);


        System.out.println("To MM: " + conversion1);
        System.out.println("To CM: " + conversion2);
        System.out.println("To M:  " + conversion3);

    }
}
