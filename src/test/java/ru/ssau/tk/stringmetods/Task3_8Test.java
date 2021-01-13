package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_8Test {

    @Test
    public void testIndexof() {
        assertEquals(Task3_8.indexof("hello world", "hello"), -1);
        assertEquals(Task3_8.indexof("hello world", "world"),6);
    }
}