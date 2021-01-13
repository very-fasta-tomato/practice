package ru.ssau.tk.arraysmetods;

public class Task2_27 {
    static boolean[] massiv(int[] array) {
        boolean[] array1 = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] % 2 == 0;
        }
        return array1;
    }
}
