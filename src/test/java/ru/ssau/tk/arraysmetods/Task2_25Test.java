package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_25Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 3, 5};
        int[] arr = Task2_25.array(array);
        assertEquals(array[0], 1);
        assertEquals(array[0], 1);
    }
}