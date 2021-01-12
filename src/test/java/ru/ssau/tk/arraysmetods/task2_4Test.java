package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_4Test {

    @Test
    public void testSetNumber() {
        int[] arr = task2_4.setNumber(5);
        assertEquals(arr[4], 2);
        assertEquals(arr[0], 10);
    }
}