package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_5Test {

    @Test
    public void testSetNumber() {
        int[] arr = Task2_5.setNumber(10);
        assertEquals(arr[6], 8);
        assertEquals(arr[9], 34);
    }
}