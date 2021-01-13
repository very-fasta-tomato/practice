package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_1Test {

    @Test
    public void testSetString() {
        String arrayStr = new String("String");
        new Task3_1().setString(arrayStr);
    }
}