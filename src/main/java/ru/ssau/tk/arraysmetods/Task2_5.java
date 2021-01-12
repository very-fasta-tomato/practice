package ru.ssau.tk.arraysmetods;

public class Task2_5 {
    public static int[] setNumber(int size) {
        int[] arr = new int[size];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}
