package ru.ssau.tk.pointclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testTestToString() {
        assertEquals(new Point(-6, 0, 1).toString(), "[-6.0, 0.0, 1.0]");
    }
}