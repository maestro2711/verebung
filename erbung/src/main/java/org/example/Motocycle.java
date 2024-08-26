package org.example;

import java.util.Objects;

public class Motocycle  extends Vehicle{
    private String type;
    private int ps;

    public Motocycle(String manufacturer, String model, int yearOfManufacture, String type, int ps) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
        this.ps = ps;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "type='" + type + '\'' +
                ", ps=" + ps +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motocycle motocycle = (Motocycle) o;
        return ps == motocycle.ps && Objects.equals(type, motocycle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, ps);
    }
}
