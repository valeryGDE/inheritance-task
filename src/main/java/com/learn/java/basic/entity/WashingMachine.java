package com.learn.java.basic.entity;

import java.util.Objects;

public class WashingMachine extends Appliance{

    private int washerCapacity;
    private int rotationalSpeed;

    public WashingMachine() {
    }

    public WashingMachine(double price, String manufacturer, String type, int washerCapacity, int rotationalSpeed) {
        super(price, manufacturer, type);
        this.washerCapacity = washerCapacity;
        this.rotationalSpeed = rotationalSpeed;
    }

    public int getWasherCapacity() {
        return washerCapacity;
    }

    public void setWasherCapacity(int washerCapacity) {
        this.washerCapacity = washerCapacity;
    }

    public int getRotationalSpeed() {
        return rotationalSpeed;
    }

    public void setRotationalSpeed(int rotationalSpeed) {
        this.rotationalSpeed = rotationalSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WashingMachine that = (WashingMachine) o;
        return washerCapacity == that.washerCapacity && rotationalSpeed == that.rotationalSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(washerCapacity, rotationalSpeed);
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "washerCapacity=" + washerCapacity +
                ", rotationalSpeed=" + rotationalSpeed +
                '}';
    }
}
