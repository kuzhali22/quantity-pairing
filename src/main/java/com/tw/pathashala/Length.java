package com.tw.pathashala;

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
        //Length that = (Length) obj;
        //System.out.println(magnitude + " " +MetricConversionUtility.convertOneMetricToAnotherMetric(that.magnitude,that.unit));
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Length that = (Length) obj;

        return MetricConversionUtility.convertOneMetricToAnotherMetric(magnitude,unit) == MetricConversionUtility.convertOneMetricToAnotherMetric(that.magnitude, that.unit);
    }
}
