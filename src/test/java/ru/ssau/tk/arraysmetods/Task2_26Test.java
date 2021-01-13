package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_26Test {

    @Test
    public void testSum() {
        assertEquals(Task2_26.sum(new int[]{1, 3, 5, 7, 9}), new int[]{4, 12, 9});
        assertEquals(Task2_26.sum(new int[]{1, 3, 5, 7, 9, 11, 13, 15}), new int[]{4, 12, 20, 28});
    }
}