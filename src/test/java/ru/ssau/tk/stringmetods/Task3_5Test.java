package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_5Test {

    @Test
    public void testStroka() {
        String _1str = "HELLO WORLD";
        String _2str = "hello world";
        String _3str = "YES";
        assertTrue(Task3_5.stroka(_1str, _2str));
        assertFalse(Task3_5.stroka(_2str, _2str));
        assertFalse(Task3_5.stroka(_2str, _3str));
        assertFalse(Task3_5.stroka(null, _2str));
        assertFalse(Task3_5.stroka(_1str, null));
        assertFalse(Task3_5.stroka(null, null));
    }
}