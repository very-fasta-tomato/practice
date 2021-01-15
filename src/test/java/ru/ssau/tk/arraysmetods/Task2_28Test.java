package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_28Test {

    @Test
    public void testLongToInt() {
        assertEquals(Task2_28.intToLong(Task2_28.longToInt(65L)), 65L);
        assertEquals(Task2_28.longToInt(Task2_28.intToLong(new int[]{1615, 5})), new int[]{1615, 5});
    }
}