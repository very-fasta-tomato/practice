package ru.ssau.tk.stringmetods;

public class Task3_13 {
    static String string(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return "";
        }
        return str.substring(from, to);
    }
}
