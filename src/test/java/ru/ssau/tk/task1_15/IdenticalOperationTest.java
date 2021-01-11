package ru.ssau.tk.task1_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    IdenticalOperation testOperation = new IdenticalOperation();

    @Test
    public void testApply() {
        double numberOne = 81.0;
        double numberTwo = 32.0;
        double notANumber = Double.NaN;
        double infinityPlus = Double.POSITIVE_INFINITY;
        double infinityMinus = Double.NEGATIVE_INFINITY;

        assertEquals(testOperation.apply(numberOne), 81.0);
        assertEquals(testOperation.apply(numberTwo), 32.0);
        assertEquals(testOperation.apply(notANumber), Double.NaN);
        assertEquals(testOperation.apply(infinityPlus), Double.POSITIVE_INFINITY);
        assertEquals(testOperation.apply(infinityMinus), Double.NEGATIVE_INFINITY);
        assertNotEquals(testOperation.apply(numberOne), 81.3);
    }
}