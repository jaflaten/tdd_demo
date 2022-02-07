package com.example.tdd_demo;

public class Range<T extends Comparable<T>>  {
    private T minValue;
    private T maxValue;

    public Range(T minValue, T maxValue) throws IllegalArgumentException {
        if (minValue.compareTo(maxValue) >= 0) {
            throw new IllegalArgumentException("minvalue must be lower than maxvalue ");
        } else {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }
    }


    public boolean isInRange(T d) {
        return d.compareTo(minValue) >= 0 && d.compareTo(maxValue) < 0;
    }

    public int getMinValue() {
        return 0;
    }

    public int getMaxValue() {
        return 1;
    }

}
