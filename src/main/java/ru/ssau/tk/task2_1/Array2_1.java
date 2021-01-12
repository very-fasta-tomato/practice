package ru.ssau.tk.task2_1;

public class Array2_1 {
    public static int[] setNumber(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
