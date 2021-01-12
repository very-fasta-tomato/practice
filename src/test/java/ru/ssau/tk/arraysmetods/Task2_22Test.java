package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_22Test {

    @Test
    public void testGetIndexOftenNumber() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(Task2_22.getIndexOftenNumber(array, 1), 0);
        assertEquals(Task2_22.getIndexOftenNumber(array, 3), 2);
        assertEquals(Task2_22.getIndexOftenNumber(array, 7), 6);
    }
}