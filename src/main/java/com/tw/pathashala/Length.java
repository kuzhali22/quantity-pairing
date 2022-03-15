package com.tw.pathashala;

public class Length {

    private final double magnitude;


    private Length(double magnitude) {
        this.magnitude = magnitude;
    }

    public static Length createCentimeter(double magnitude) {

        return new Length(MetricConversionUtility.convertOneMetricToAnotherMetric(magnitude, LengthMetrics.CENTIMETER));
    }

    public static Length createMeter(double magnitude) {

        return new Length(MetricConversionUtility.convertOneMetricToAnotherMetric(magnitude, LengthMetrics.METER));
    }

    public static Length createKiloMeter(double magnitude) {

        return new Length(MetricConversionUtility.convertOneMetricToAnotherMetric(magnitude, LengthMetrics.KILOMETER));
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
        //return Double.compare(magnitude, that.magnitude) == 0;
        return magnitude == that.magnitude;
    }
}
