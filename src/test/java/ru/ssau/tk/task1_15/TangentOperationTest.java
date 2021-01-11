package ru.ssau.tk.task1_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    TangentOperation testOperation = new TangentOperation();

    @Test
    public void testApply() {
        double numberOne = 81.0;
        double numberTwo = 0.785;
        double notANumber = Double.NaN;
        double infinityPlus = Double.POSITIVE_INFINITY;
        double infinityMinus = Double.NEGATIVE_INFINITY;

        assertEquals(testOperation.apply(numberOne), -0.81, 0.01);
        assertEquals(testOperation.apply(numberTwo), 1.0, 0.01);
        assertEquals(testOperation.apply(notANumber), Double.NaN);
        assertEquals(testOperation.apply(infinityPlus), Double.NaN);
        assertNotEquals(testOperation.apply(infinityMinus), null);
        assertNotEquals(testOperation.apply(numberOne), 81.3);
    }
}