package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_29Test {

    @Test
    public void testArray() {
        int[] array = Task2_29.Array(7, 3);
        assertEquals(array[0], 5);
        assertEquals(array[1], 6);
        assertEquals(array[2], 7);
        assertEquals(array[3], 1);
    }
}