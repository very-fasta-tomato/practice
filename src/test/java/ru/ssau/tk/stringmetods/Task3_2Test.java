package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_2Test {

    @Test
    public void testStr() {
        String stroka = "String";
        new Task3_2().str(stroka);
        String stroka1 = "Строка";
        new Task3_2().str(stroka1);
    }
}