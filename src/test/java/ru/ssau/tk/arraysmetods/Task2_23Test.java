package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_23Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        Task2_23.Array(array);
        assertEquals(array[0], 9);
        assertEquals(array[4], 1);
    }
}