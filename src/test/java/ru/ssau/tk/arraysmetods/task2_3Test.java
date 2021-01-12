package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_3Test {

    @Test
    public void testSetNumber() {
        int[] arr = task2_3.setNumber(5);
        assertEquals(arr[4], 9);
        assertEquals(arr.length, 5);
    }
}