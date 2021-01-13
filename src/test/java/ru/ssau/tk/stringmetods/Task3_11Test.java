package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_11Test {

    @Test
    public void testMetod() {
        String[] array = new String[]{"Understandble", "have", " a ", "nice ", " day"};
        assertEquals(Task3_11.metod(array, "h", "e"), 1);
        assertEquals(Task3_11.metod(array, "d", "y"), 1);
    }
}