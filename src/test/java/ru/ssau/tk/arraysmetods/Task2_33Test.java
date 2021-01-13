package ru.ssau.tk.arraysmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_33Test {

    @Test
    public void testArrSting() {
        String[] array = new String[]{"String 1", "String 2", "String 3"};
        Task2_33.arrSting(array);
    }
}