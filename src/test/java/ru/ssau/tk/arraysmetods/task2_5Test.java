package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_5Test {

    @Test
    public void testSetNumber() {
        int[] arr = task2_5.setNumber(10);
        assertEquals(arr[6], 8);
        assertEquals(arr[9], 34);
    }
}