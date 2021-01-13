package ru.ssau.tk.arraysmetods;

public class Task2_26 {
    static int[] sum(int[] array) {
        int[] array1 = new int[array.length / 2 + (array.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array[2 * i] + (2 * i + 1 < array.length ? array[2 * i + 1] : 0);
        }
        return array1;
    }
}
