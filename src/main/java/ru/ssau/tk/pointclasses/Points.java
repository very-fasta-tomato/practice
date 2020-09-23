package ru.ssau.tk.pointclasses;
import ru.ssau.tk.pointclasses.Point.*;

public class Points {
    private Points(){

    }
    public static Point sum(Point a, Point b){
        return new Point(a.X + b.X, a.Y + b.Y, a.Z + b.Z);
    }
    public static Point subtract(Point a, Point b){
        return new Point(a.X - b.X, a.Y - b.Y, a.Z - b.Z);
    }
    public static Point multiply(Point a, Point b){
        return new Point(a.X * b.X, a.Y * b.Y, a.Z * b.Z);
    }
    public static Point divide(Point a, Point b){
        return new Point(a.X / b.X, a.Y / b.Y, a.Z / b.Z);
    }
}
