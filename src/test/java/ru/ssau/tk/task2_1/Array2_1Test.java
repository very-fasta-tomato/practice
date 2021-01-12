package ru.ssau.tk.task2_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_1Test {

    @Test
    public void testSetNumber() {
        int[] array = Array2_1.setNumber(5);
        assertEquals(array.length, 5);
    }
}