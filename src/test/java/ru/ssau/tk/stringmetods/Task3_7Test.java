package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_7Test {

    @Test
    public void testIndex() {
        assertEquals(Task3_7.index("abcabcabc", "ca"), 2);
        assertEquals(Task3_7.index("cat", "taxi"), -1);
    }
}