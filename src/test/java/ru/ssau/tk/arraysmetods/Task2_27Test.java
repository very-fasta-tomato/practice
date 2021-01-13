package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_27Test {

    @Test
    public void testMassiv() {
        assertEquals(Task2_27.massiv(new int[]{1, 4, 5}), new boolean[]{false, true, false});
    }
}