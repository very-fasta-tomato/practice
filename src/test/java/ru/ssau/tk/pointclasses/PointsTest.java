package ru.ssau.tk.pointclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    Point firstPoint = new Point(2, 8, 16);
    Point secondPoint = new Point(8.1, 9.36,24.45);
    Point thirdPoint = new Point(100, 100, 100);
    final double delta = 0.01;

    @Test
    public void testSum() {
        Point resultPoint = Points.sum(firstPoint, secondPoint);
        assertEquals(resultPoint.X, 10.1, delta);
        assertEquals(resultPoint.Y, 17.36, delta);
        assertEquals(resultPoint.Z, 40.45, delta);
    }

    @Test
    public void testSubtract() {
        Point resultPoint = Points.subtract(firstPoint, secondPoint);
        assertEquals(resultPoint.X, -6.1, delta);
        assertEquals(resultPoint.Y, -1.36, delta);
        assertEquals(resultPoint.Z, -8.45, delta);
    }

    @Test
    public void testMultiply() {
        Point resultPoint = Points.multiply(secondPoint, thirdPoint);
        assertEquals(resultPoint.X, 810.0, delta);
        assertEquals(resultPoint.Y, 936.0, delta);
        assertEquals(resultPoint.Z, 2445.0, delta);
    }

    @Test
    public void testDivide() {
        Point resultPoint = Points.divide(firstPoint, thirdPoint);
        assertEquals(resultPoint.X, 0.02, delta);
        assertEquals(resultPoint.Y, 0.08, delta);
        assertEquals(resultPoint.Z, 0.155, delta);
    }

    @Test
    public void testEnlarge() {
        Point resultPoint = Points.enlarge(firstPoint, 5);
        assertEquals(resultPoint.X, 10.0, delta);
        assertEquals(resultPoint.Y, 40.0, delta);
        assertEquals(resultPoint.Z, 80.0, delta);
        resultPoint = Points.enlarge(secondPoint, 2.25);
        assertEquals(resultPoint.X, 18.22, delta);
        assertEquals(resultPoint.Y, 21.06, delta);
        assertEquals(resultPoint.Z, 55.01, delta);
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(firstPoint), 18.0, delta);
        assertNotEquals(Points.length(secondPoint), 18.0, delta);
        assertEquals(Points.length(thirdPoint), 173.2, delta);
    }

    @Test
    public void testOpposite() {
        Point resultPoint = Points.opposite(firstPoint);
        assertEquals(resultPoint.X, -2.0, delta);
        assertEquals(resultPoint.Y, -8.0, delta);
        assertEquals(resultPoint.Z, -16.0, delta);
    }

    @Test
    public void testInverse() {
        Point resultPoint = Points.inverse(firstPoint);
        assertEquals(resultPoint.X, 0.5, delta);
        assertEquals(resultPoint.Y, 0.13, delta);
        assertEquals(resultPoint.Z, 0.06, delta);
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(secondPoint, thirdPoint), 4191.0, delta);
    }

    @Test
    public void testVectorProduct() {
        Point resultPoint = Points.vectorProduct(firstPoint, thirdPoint);
        assertEquals(resultPoint.X, -800.0, delta);
        assertEquals(resultPoint.Y, 1400.0, delta);
        assertEquals(resultPoint.Z, -600.0, delta);
    }
}