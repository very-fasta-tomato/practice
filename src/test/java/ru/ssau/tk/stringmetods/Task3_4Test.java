package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_4Test {

    @Test
    public void testStroka() {
        assertEquals(Task3_4.stroka("andna"), true);
        assertEquals(Task3_4.stroka("notIsPalindrome"), false);
        assertEquals(Task3_4.stroka("i"), true);
    }
}