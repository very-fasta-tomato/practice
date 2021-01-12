package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_15Test {

    @Test
    public void testSetArray() {
        int[] arr = {1, 2, 3};
        assertEquals(Task2_15.setArray(arr, 3), true);
        assertEquals(Task2_15.setArray(arr, -1), false);
    }
}