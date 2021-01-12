package ru.ssau.tk.task2_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2Test {

    @Test
    public void testSetNumber() {
        int[] array = new Array2().setNumber(10);
        assertEquals(array.length, 10);
        assertEquals(array[0], 2);
        assertEquals(array[9], 2);
        assertEquals(array[6], 1);
    }
}