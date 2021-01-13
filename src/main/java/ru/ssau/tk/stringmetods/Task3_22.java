package ru.ssau.tk.stringmetods;

public class Task3_22 {
    static String getStringOfNumber(int cout) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < cout; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
