package com.tw.pathashala;

public class MetricConversionUtility {
    public static double convertOneMetricToAnotherMetric(double magnitude, LengthMetrics metric) {

        return magnitude * metric.getMetricValue();

    }
}