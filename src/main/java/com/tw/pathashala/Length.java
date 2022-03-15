package com.tw.pathashala;

public class Length {

    public static final int METER_TO_CENTIMETER = 100;
    private static final int METER_TO_KILOMETER = 100000;
    private final double magnitude;

    enum LengthMetrics {
        METER,
        CENTIMETER,
        KILOMETER
    }

    private Length(double magnitude) {
        this.magnitude = magnitude;
    }

    public static Length createCentimeter(double magnitude) {

        return new Length(magnitude);
    }

    public static Length createMeter(double magnitude) {

        return new Length(magnitude * METER_TO_CENTIMETER);
    }

    public static Length createKiloMeter(double magnitude) {

        return new Length(magnitude * METER_TO_KILOMETER);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Length that = (Length) obj;

        return Double.compare(magnitude, that.magnitude) == 0;

        //return magnitude == that.magnitude;
    }
}
