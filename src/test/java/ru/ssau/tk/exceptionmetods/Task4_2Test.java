package ru.ssau.tk.exceptionmetods;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_2Test {

    @Test
    public void testSet() {
        String[] str = {"Understandably", "have", "a", "nice", "day"};
        assertEquals(Task4_2.set(str, 0), new String[]{"U", "h", "a", "n", "d"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> assertEquals(Task4_2.set(str, 1),
                        new String[]{"n", "a", "", "i", "a"}));

        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(Task4_2.set(null, 0)));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(Task4_2.set(str1, 0)));
    }
}
