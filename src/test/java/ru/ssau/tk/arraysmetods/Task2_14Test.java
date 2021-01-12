package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_14Test {

    @Test
    public void testSetArray() {
        int array[] = new int[]{1, 2, -3};
        Task2_14.setArray(array);
        assertEquals((array[0]), -1);
        assertEquals((array[1]), -2);
        assertEquals(array[2], 3);
    }
}