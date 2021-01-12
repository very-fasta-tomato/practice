package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_6Test {

    @Test
    public void testSetnumber() {
        int[] arr = Task2_6.setnumber(10);
        assertEquals(arr.length, 10);
        assertEquals(arr[3], 9);
        assertEquals(arr[9], 81);
    }
}