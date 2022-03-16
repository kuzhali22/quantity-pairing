package com.tw.pathashala;

import static com.tw.pathashala.LengthMetrics.convertToRequiredMetric;
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


    public Length plus(Length lengthToPlus) {
        double thisMagnitude = convertUnitToCM(this.magnitude, this.unit);

        double thatMagnitude = convertUnitToCM(lengthToPlus.magnitude, lengthToPlus.unit);

        double resultMagnitude = thisMagnitude + thatMagnitude;

        resultMagnitude = convertToRequiredMetric(resultMagnitude, this.unit);

        return new Length(resultMagnitude, unit);
    }

    public Length minus(Length lengthToMinus) {
        double thisMagnitude = convertUnitToCM(this.magnitude, this.unit);

        double thatMagnitude = convertUnitToCM(lengthToMinus.magnitude, lengthToMinus.unit);

        double resultMagnitude = thisMagnitude - thatMagnitude;

        resultMagnitude = convertToRequiredMetric(resultMagnitude, this.unit);

        return new Length(resultMagnitude, unit);
    }

}
