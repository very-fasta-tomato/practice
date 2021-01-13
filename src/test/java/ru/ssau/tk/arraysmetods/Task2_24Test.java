package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_24Test {

    @Test
    public void testSdvig() {
        int[] massiv = new int[]{1, 3, 5, 7, 9};
        Task2_24.sdvig(massiv);
        assertEquals(massiv[0], -2);
        Task2_24.sdvig(massiv);
        assertEquals(massiv[0], 1);
    }
}