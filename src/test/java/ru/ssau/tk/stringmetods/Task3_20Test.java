package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_20Test {

    @Test
    public void testStroka() {
        String[] str = {"Hello", "world"};
        assertEquals(Task3_20.stroka(str), "Hello, world");
    }
}