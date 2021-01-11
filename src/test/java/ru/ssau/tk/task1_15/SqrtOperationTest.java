package ru.ssau.tk.task1_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    SqrtOperation testOperation = new SqrtOperation();

    @Test
    public void testApply() {
        double numberOne = 81.0;
        double numberTwo = 32.0;
        double notANumber = Double.NaN;
        double infinityPlus = Double.POSITIVE_INFINITY;
        double infinityMinus = Double.NEGATIVE_INFINITY;

        assertEquals(testOperation.apply(numberOne), 9.0);
        assertEquals(testOperation.apply(numberTwo), 5.65, 0.01);
        assertEquals(testOperation.apply(notANumber), Double.NaN);
        assertEquals(testOperation.apply(infinityPlus), Double.POSITIVE_INFINITY);
        assertNotEquals(testOperation.apply(infinityMinus), Double.NEGATIVE_INFINITY);
        assertNotEquals(testOperation.apply(numberOne), 81.3);
    }
}