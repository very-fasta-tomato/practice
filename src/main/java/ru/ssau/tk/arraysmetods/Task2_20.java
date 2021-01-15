package ru.ssau.tk.arraysmetods;

public class Task2_20 {
    static boolean Divider(int[] array) {
        int size = array.length;
        int firstCount = 0;
        int lastCount = 0;
        for (int i : array) {
            if (i % array[0] == 0)
                firstCount++;
        }
        for (int i : array) {
            if (i % array[size - 1] == 0)
                lastCount++;
        }
        return firstCount > lastCount;
    }
}
