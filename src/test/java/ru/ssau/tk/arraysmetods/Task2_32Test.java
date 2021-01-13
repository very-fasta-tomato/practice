package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_32Test {

    @Test
    public void testSort() {
        Double[] array = new Double[]{Double.NaN, 1., 3.};
        Task2_32.sort(array);
        assertEquals(array[2].doubleValue(), 3.);
        assertEquals(array[0].doubleValue(), Double.NaN);
    }
}