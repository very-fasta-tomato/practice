package ru.ssau.tk.arraysmetods;

public class Task2_17 {
    static int numberEven(int[] array) {
        int count = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
