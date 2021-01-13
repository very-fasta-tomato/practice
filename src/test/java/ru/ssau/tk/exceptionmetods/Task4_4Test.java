package ru.ssau.tk.exceptionmetods;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_4Test {

    @Test
    public void testGetString() {
        Task4_4.getString("4", "2");
        Assert.assertThrows(ArithmeticException.class,
                () -> Task4_4.getString("4", "0"));
        Assert.assertThrows(NumberFormatException.class,
                () -> Task4_4.getString("u", "1"));
        Assert.assertThrows(NumberFormatException.class,
                () -> Task4_4.getString("u", "a"));
    }
}