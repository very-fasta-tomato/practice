package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_20Test {

    @Test
    public void testDivider() {
        int[] array1 = new int[]{1, 2, 4, 8, 16, 2};
        int[] array2 = new int[]{10, 2, 4, 8, 2};
        assertTrue(Task2_20.Divider(array1));
        assertFalse(Task2_20.Divider(array2));
    }
}