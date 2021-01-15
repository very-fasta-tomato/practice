package ru.ssau.tk.personclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import static org.testng.Assert.*;

public class Task4_6Test {

    @Test
    public void testSet() {
        Object object = new Object();
        Person person = new Person();
        String fileName = "";

        Assert.assertThrows(FileNotFoundException.class, () -> Task4_6.set(new ObjectOutputStream(new FileOutputStream(fileName)), object));
        Assert.assertThrows(ClassCastException.class, () -> Task4_6.set(new ByteArrayOutputStream(), person));
    }
}