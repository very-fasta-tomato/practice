package ru.ssau.tk.pointclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void testNamedPoint() {
        NamedPoint firstTestPoint = new NamedPoint();
        assertEquals(firstTestPoint.X, 0.0, 0.01);
        assertEquals(firstTestPoint.Y, 0.0, 0.01);
        assertEquals(firstTestPoint.Z, 0.0, 0.01);
        assertEquals(firstTestPoint.getName(), "Origin");

        NamedPoint secondTestPoint = new NamedPoint(5, 6, 10, "PointA");
        assertEquals(secondTestPoint.X, 5.0, 0.01);
        assertEquals(secondTestPoint.Y, 6.0, 0.01);
        assertEquals(secondTestPoint.Z, 10.0, 0.01);
        assertEquals(secondTestPoint.getName(), "PointA");
    }

    @Test
    public void testReset() {
        NamedPoint namedPoint = new NamedPoint(1, 1, 1, "B");
        assertEquals(namedPoint.getName(), "B");
        namedPoint.reset();
        assertEquals(namedPoint.getName(), "Absent");
    }

    @Test
    public void testTestToString() {
        assertEquals(new NamedPoint(2., 4., 3., "x").toString(), "x: [2.0, 4.0, 3.0]");
        assertEquals(new NamedPoint(-0, 0, 5).toString(), "[0.0, 0.0, 5.0]");
    }
}