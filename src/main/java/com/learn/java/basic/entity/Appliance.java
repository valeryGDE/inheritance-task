package com.learn.java.basic.entity;

import java.util.Objects;

public class Appliance {

    private double price;
    private String manufacturer;
    private String type;

    public Appliance() {
    }

    public Appliance(double price, String manufacturer, String type) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.price, price) == 0 && Objects.equals(manufacturer, appliance.manufacturer) && Objects.equals(type, appliance.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, manufacturer, type);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
