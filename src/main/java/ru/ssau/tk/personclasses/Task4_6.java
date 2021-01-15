package ru.ssau.tk.personclasses;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Task4_6 {
    public static void set(OutputStream out, Object object) throws IOException {
        ((ObjectOutputStream) out).writeObject(object);
    }
}
