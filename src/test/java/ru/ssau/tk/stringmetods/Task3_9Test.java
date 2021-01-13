package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_9Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Task3_9.getIndexOf("hello world", "hello"), 0);
        assertEquals(Task3_9.getIndexOf("hello world", "world"),-1);
    }
}