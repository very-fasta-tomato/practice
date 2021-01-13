package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_13Test {

    @Test
    public void testString() {
        String str = "Understandable have a nice day";
        int maxSizeStr = str.length();
        assertEquals(Task3_13.string(str, -2, maxSizeStr), str);
        assertEquals(Task3_13.string(str, 2, maxSizeStr), str.substring(2));
        assertEquals(Task3_13.string(str, -2, 14), str.substring(0, 14));
        assertEquals(Task3_13.string(str, 2, 14), str.substring(2, 14));
    }
}