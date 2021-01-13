package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_22Test {

    @Test
    public void testGetStringOfNumber() {
        assertEquals(Task3_22.getStringOfNumber(7),"0123456");
        System.out.println(Task3_22.getStringOfNumber(10000));
    }
}