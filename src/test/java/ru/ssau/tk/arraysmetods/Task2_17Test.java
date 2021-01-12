package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_17Test {

    @Test
    public void testNumberEven() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        assertEquals(Task2_17.numberEven(array), 5);
    }
}