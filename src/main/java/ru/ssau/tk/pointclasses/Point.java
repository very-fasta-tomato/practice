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
    double length (){
        return Math.sqrt(Math.pow(X,2) + Math.pow(Y,2) + Math.pow(Z,2));
    }
    Point point1 = new Point(0,0,0);
    Point point2 = new Point(1, 1, 1);
    Point point3 = new Point(1, 2, 3);
}
