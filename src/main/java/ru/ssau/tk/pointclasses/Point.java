package ru.ssau.tk.pointclasses;

public class Point {
    public final double X;
    public final double Y;
    public final double Z;

    public Point(double X, double Y, double Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    double length() {
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));
    }

    @Override
    public String toString() {
        return "[" + X + ", " + Y + ", " + Z + ']';
    }
}
