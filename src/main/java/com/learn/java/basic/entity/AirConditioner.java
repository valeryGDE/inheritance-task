package com.learn.java.basic.entity;

import java.util.Objects;

public class AirConditioner extends Appliance {

    private double roomSize;
    private String conditionerType;

    public AirConditioner() {
    }

    public AirConditioner(double price, String manufacturer, String type, double roomSize, String conditionerType) {
        super(price, manufacturer, type);
        this.roomSize = roomSize;
        this.conditionerType = conditionerType;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public String getConditionerType() {
        return conditionerType;
    }

    public void setConditionerType(String conditionerType) {
        this.conditionerType = conditionerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AirConditioner that = (AirConditioner) o;
        return Double.compare(that.roomSize, roomSize) == 0 && Objects.equals(conditionerType, that.conditionerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomSize, conditionerType);
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "roomSize=" + roomSize +
                ", conditionerType='" + conditionerType + '\'' +
                '}';
    }
}
