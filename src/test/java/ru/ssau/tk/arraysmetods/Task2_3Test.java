package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_3Test {

    @Test
    public void testSetNumber() {
        int[] arr = Task2_3.setNumber(5);
        assertEquals(arr[4], 9);
        assertEquals(arr.length, 5);
    }
}