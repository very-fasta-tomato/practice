package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_18Test {

    @Test
    public void testMaxvalue() {
        assertNull(Task2_18.Maxvalue(new int[]{}), null);
        assertEquals(Task2_18.Maxvalue(new int[]{12, 43, 81, 22, 6}), 81, 0.001);
    }
}