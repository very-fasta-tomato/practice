package ru.ssau.tk.pointclasses;

public class NamedPoint extends Point {
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
}
