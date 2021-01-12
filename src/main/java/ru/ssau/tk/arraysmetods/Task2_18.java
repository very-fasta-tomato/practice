package ru.ssau.tk.arraysmetods;

public class Task2_18 {
    static Integer Maxvalue(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                temp = array[i + 1];
            }
        }
        return temp;
    }
}
