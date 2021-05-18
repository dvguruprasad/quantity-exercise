package com.tw.pathashala;

public class Length {

    private final double magnitude;
    private final Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        double thisValue = this.unit.getConversionFactor() * this.magnitude;
        double thatValue = that.unit.getConversionFactor() * that.magnitude;
        return Double.compare(thatValue, thisValue) == 0;
    }
}