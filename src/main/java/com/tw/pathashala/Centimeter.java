package com.tw.pathashala;

public class Centimeter {

    private final double magnitude;

    public Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }

    public static Centimeter centimeter(double magnitude) {

        return new Centimeter(magnitude);
    }

    public static Centimeter meter(double magnitude) {

        return new Centimeter(magnitude * 100);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Centimeter that = (Centimeter) obj;

        return magnitude == that.magnitude;
    }
}
