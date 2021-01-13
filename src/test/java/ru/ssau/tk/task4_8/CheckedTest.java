package ru.ssau.tk.task4_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.task4_8.Checked.*;

public class CheckedTest {
    @Test
    public void test() {
        try {
            throwCheckedException();
        } catch (Checked e) {
            e.getCause();
        }
    }
}