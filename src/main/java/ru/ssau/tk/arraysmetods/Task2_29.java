package ru.ssau.tk.arraysmetods;

public class Task2_29 {
    static int[] Array(int size, int indexBegining) {
        if (indexBegining >= size) {
            return null;
        } else {
            int[] cout = new int[size];
            for (int i = 0; i < size; i++) {
                cout[i + indexBegining - (i + indexBegining >= size ? size : 0)] = i + 1;
            }
            return cout;
        }
    }
}
