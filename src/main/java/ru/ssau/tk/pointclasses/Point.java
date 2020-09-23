package ru.ssau.tk.pointclasses;

public class Point {
    public final double X;
    public final double Y;
    public final double Z;

    public Point(double X, double Y, double Z){
        this.X=X;
        this.Y=Y;
        this.Z=Z;
    }
    Point point1 = new Point(0,0,0);
    Point point2 = new Point(1, 1, 1);
    Point point3 = new Point(1, 2, 3);
}
