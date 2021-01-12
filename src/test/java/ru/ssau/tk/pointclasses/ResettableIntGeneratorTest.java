package ru.ssau.tk.pointclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    ResettableIntGenerator res = new ResettableIntGenerator();

    @Test
    public void testNexInt() {
        assertEquals(res.nexInt(), 0);
        assertEquals(res.nexInt(), 1);
    }

    @Test
    public void testReset() {
        assertEquals(res.nexInt(), 2);
        res.reset();
        assertEquals(res.nexInt(), 0);
    }
}