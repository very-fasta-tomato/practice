package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_7Test {

    @Test
    public void testSolveQuadraticEquation() {
        assertEquals(Task2_7.solveQuadraticEquation(0, 2, -4), new double[]{2});
        assertEquals(Task2_7.solveQuadraticEquation(10, 200, 1654), new double[]{});
        assertEquals(Task2_7.solveQuadraticEquation(1, -2, 1), new double[]{1});
        assertEquals(Task2_7.solveQuadraticEquation(1, 0, -9), new double[]{3, -3});
    }
}