package ru.ssau.tk.stringmetods;

public class Task3_9 {
    static int getIndexOf(String str1, String str2) {
        return str1.lastIndexOf(str2, str1.length() / 2);
    }
}
