package com.learn.java.basic.entity;

import java.util.Objects;

public class Toaster extends Appliance {

    private int numberOfSlots;

    public Toaster() {
    }

    public Toaster(double price, String manufacturer, String type, int numberOfSlots) {
        super(price, manufacturer, type);
        this.numberOfSlots = numberOfSlots;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Toaster toaster = (Toaster) o;
        return numberOfSlots == toaster.numberOfSlots;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSlots);
    }

    @Override
    public String toString() {
        return "Toaster{" +
                "numberOfSlots=" + numberOfSlots +
                '}';
    }
}
