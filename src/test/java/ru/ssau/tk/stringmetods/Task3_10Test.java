package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_10Test {

    @Test
    public void testSet() {
        String[] array = new String[]{"Understandable", "have", "a", "nice", "day"};
        assertEquals(Task3_10.set(array, "h", "e"), 1);
        assertEquals(Task3_10.set(array, "a", "e"), 0);
    }
}