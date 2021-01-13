package ru.ssau.tk.arraysmetods;

public class Task2_32 {
    static void sort(Double[] array) {
        for (Double j : array) {
            if (j.isNaN()) {
                return;
            } else {
                Task2_32.sort(array);
            }
        }
    }
}
