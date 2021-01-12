package ru.ssau.tk.arraysmetods;

public class Task2_9 {
    public static int[] setfunction(int begiNumber, int delta, int size) {
        int[] arr = new int[size];
        arr[0] = begiNumber;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + delta;
        }
        return arr;
    }
}
