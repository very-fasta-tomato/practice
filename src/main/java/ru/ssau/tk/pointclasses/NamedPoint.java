package ru.ssau.tk.pointclasses;

import java.util.Objects;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public NamedPoint(double X, double Y, double Z, String name) {
        super(X, Y, Z);
        this.name = name;
    }

    public NamedPoint(double X, double Y, double Z) {
        super(X, Y, Z);
    }

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    @Override
    public void reset() {
        name = "Absent";
    }

    @Override
    public String toString() {
        if (Objects.equals(null, name)) return super.toString();
        return name + ": " + super.toString();
    }
}
