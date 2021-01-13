package ru.ssau.tk.stringmetods;

import java.util.Objects;

public class Task3_5 {
    static boolean stroka(String str1, String str2) {
        return !Objects.equals(null, str1) && !Objects.equals(null, str2)
                && !str1.equals(str2)
                && str1.equalsIgnoreCase(str2);
    }
}
