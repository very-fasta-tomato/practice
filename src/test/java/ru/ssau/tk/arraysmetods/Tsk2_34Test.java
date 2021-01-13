package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Tsk2_34Test {

    @Test
    public void testMultiply() {
        assertEquals(Tsk2_34.multiply(new Double[]{1., Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}).doubleValue(), 4.);
    }
}