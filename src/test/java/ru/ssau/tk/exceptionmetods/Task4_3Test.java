package ru.ssau.tk.exceptionmetods;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_3Test {

    @Test
    public void testGetCharString() {
        String[] arrayStr = new String[]{"Understandably", "have", "a", "nice", "day"};
        assertEquals(Task4_3.getCharString(arrayStr, 0, 0),
                'U');
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_3.getCharString(arrayStr, 20, 0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Task4_3.getCharString(arrayStr, 0, 20));
    }
}