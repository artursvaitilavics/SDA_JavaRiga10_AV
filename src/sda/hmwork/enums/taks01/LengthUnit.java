package sda.hmwork.enums.taks01;

public enum LengthUnit {
    MILLIMETER,
    CENTIMETER,
    METER;

    public double convert(double value, LengthUnit convertToUnit) {
        switch (convertToUnit) {
            case MILLIMETER:
                if (this.equals(CENTIMETER)) {
                    return value * 10;
                } else if (this.equals(METER)) {
                    return value * 1000;
                } else {
                    return value;
                }
            case CENTIMETER:
                if (this.equals(MILLIMETER))
                    return value * 0.1;
                else if (this.equals(METER))
                    return value * 100;
                else
                    return value;
            case METER:
                if (this.equals(MILLIMETER))
                    return value * 0.001;
                else if (this.equals(CENTIMETER))
                    return value * 0.01;
                else
                    return value;
        }
        return 0;
    }
}
