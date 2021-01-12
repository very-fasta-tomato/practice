package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_16Test {

    @Test
    public void testSetFunction() {
        Integer[] array = new Integer[2];
        array[1] = null;
        array[0] = 1;
        assertTrue(Task2_16.setFunction(array));
    }
}