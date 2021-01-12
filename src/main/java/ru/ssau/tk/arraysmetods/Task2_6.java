package ru.ssau.tk.arraysmetods;

public class Task2_6 {
    public static int[] setnumber(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        return array;
    }
}
