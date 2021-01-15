package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_11Test {

    @Test
    public void testGetDividersOfNumbers() {
        assertEquals(Task2_11.getDividersOfNumbers(6), new double[]{1, 2, 3, 6});
        assertEquals(Task2_11.getDividersOfNumbers(7), new double[]{1, 7});
    }
}