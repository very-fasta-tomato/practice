package ru.ssau.tk.pointclasses;

import ru.ssau.tk.pointclasses.Point.*;

public class Points {
    private Points() {

    }

    public static Point sum(Point a, Point b) {
        return new Point(a.X + b.X, a.Y + b.Y, a.Z + b.Z);
    }

    public static Point subtract(Point a, Point b) {
        return new Point(a.X - b.X, a.Y - b.Y, a.Z - b.Z);
    }

    public static Point multiply(Point a, Point b) {
        return new Point(a.X * b.X, a.Y * b.Y, a.Z * b.Z);
    }

    public static Point divide(Point a, Point b) {
        return new Point(a.X / b.X, a.Y / b.Y, a.Z / b.Z);
    }

    public static Point enlarge(Point a, double b) {
        return new Point(a.X * b, a.Y * b, a.Z * b);
    }

    static double length(Point a) {
        return a.length();
    }

    static Point opposite(Point a) {
        return new Point(a.X * -1, a.Y * -1, a.Z * -1);
    }

    static Point inverse(Point a) {
        return new Point(1 / a.X, 1 / a.Y, 1 / a.Z);
    }

    public static double scalarProduct(Point a, Point b) {
        return a.X * b.X + a.Y * b.Y + a.Z * b.Z;
    }

    public static Point vectorProduct(Point a, Point b) {
        return new Point(a.Y * b.Z - a.Z * b.Y, a.Z * b.X - a.X * b.Z, a.X * b.Y - a.Y * b.X);
    }
}
