package com.tw.pathashala;

import static com.tw.pathashala.LengthMetrics.convertUnitToCM;

public class Length {

    private final double magnitude;
    private final LengthMetrics unit;


    private Length(double magnitude, LengthMetrics unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }


    public static Length createCentimeter(double magnitude) {

        return new Length(magnitude, LengthMetrics.CENTIMETER);
    }

    public static Length createMeter(double magnitude) {

        return new Length(magnitude, LengthMetrics.METER);
    }

    public static Length createKiloMeter(double magnitude) {

        return new Length(magnitude, LengthMetrics.KILOMETER);
    }

    public static Length createMeterCentimeter(double meterMagnitude, double centimeterMagnitude) {

        meterMagnitude = LengthMetrics.convertUnitToCM(meterMagnitude, LengthMetrics.METER);

        return new Length(meterMagnitude + centimeterMagnitude, LengthMetrics.CENTIMETER);
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

        double thisMagnitude = convertUnitToCM(magnitude, unit);
        double thatMagnitude = convertUnitToCM(that.magnitude, that.unit);

        return thisMagnitude == thatMagnitude;
    }
}
