package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_19Test {

    @Test
    public void testGetArrayEven() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,20};
        assertEquals(Task2_19.getArrayEven(array),25);
    }
}