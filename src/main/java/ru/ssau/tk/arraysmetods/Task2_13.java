package ru.ssau.tk.arraysmetods;

public class Task2_13 {
    public static int[] getArr(int size) {
        if (size == 0) {
            return null;
        }
        int[] array = new int[size];
        for (int i = 0; i < Math.ceil((double) size / 2); i++) {
            array[i] = i + 1;
            array[size - i - 1] = i + 1;
        }
        return array;
    }
}
