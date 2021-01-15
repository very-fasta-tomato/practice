package ru.ssau.tk.stringmetods;

import org.testng.annotations.Test;
import ru.ssau.tk.personclasses.Person;
import ru.ssau.tk.pointclasses.NamedPoint;
import ru.ssau.tk.pointclasses.Point;

import static org.testng.Assert.*;

public class Task3_18Test {

    @Test
    public void testGetDescription() {
        Task3_18.getDescription(new Person("Wasd", "Qwerty", 828183));
        Task3_18.getDescription(new Point(0, 1, 2));
        Task3_18.getDescription(new NamedPoint(0, 1, 4, "X"));
    }
}