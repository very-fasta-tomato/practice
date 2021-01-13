package ru.ssau.tk.stringmetods;

public class Task3_4 {
    static boolean stroka(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
