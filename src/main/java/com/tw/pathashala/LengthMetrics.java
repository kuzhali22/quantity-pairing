package com.tw.pathashala;

enum LengthMetrics {

    METER(100),
    CENTIMETER(1),
    KILOMETER(100000);

    private final int unitValue;

    LengthMetrics(int metricValue) {
        this.unitValue = metricValue;
    }

    public static double convertUnitToCM(double magnitude, LengthMetrics metric) {

        return magnitude * metric.unitValue;

    }
}
