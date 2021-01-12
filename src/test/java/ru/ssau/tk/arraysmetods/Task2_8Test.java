package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_8Test {

    @Test
    public void testSetNumber() {
        final double accuracy = 0.00001;
        double[] array = Task2_8.setNumber(11);
        assertEquals(array[0], 1, accuracy);
        assertEquals(array[5], 8, accuracy);
        assertEquals(array[6], 10, accuracy);
    }
}