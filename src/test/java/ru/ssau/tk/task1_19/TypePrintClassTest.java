package ru.ssau.tk.task1_19;

import org.testng.annotations.Test;
import ru.ssau.tk.personclasses.*;
import ru.ssau.tk.pointclasses.*;

import static org.testng.Assert.*;

public class TypePrintClassTest {

    @Test
    public void testPrintType() {
        TypePrintClass.printType("word");
        TypePrintClass.printType('w');
        TypePrintClass.printType((byte) 1);
        TypePrintClass.printType((short) 1);
        TypePrintClass.printType(1);
        TypePrintClass.printType(3L);
        TypePrintClass.printType(9.1f);
        TypePrintClass.printType(1.2f);
        TypePrintClass.printType(true);
        TypePrintClass.printType(new Person());
        TypePrintClass.printType(new Point(0, 0, 0));

    }
}