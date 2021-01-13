package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_12Test {

    @Test
    public void testMetod() {
        assertEquals(new Task3_12().metod("opopopopo", "opo", "po"), "popppo");
    }
}