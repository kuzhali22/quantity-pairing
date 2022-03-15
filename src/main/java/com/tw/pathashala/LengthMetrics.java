package com.tw.pathashala;

enum LengthMetrics {

    METER(100),
    CENTIMETER(1),
    KILOMETER(100000);

    private final int metricValue;

    LengthMetrics(int metricValue) {
        this.metricValue = metricValue;
    }

    public int getMetricValue() {
        return metricValue;
    }
}
