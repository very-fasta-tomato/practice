package ru.ssau.tk.arraysmetods;

public class Task2_12 {
    static double[] getDividersOfNumbers(int number) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        double[] array = new double[count * 2 + (Math.sqrt(number) == (int) Math.sqrt(number) ? 1 : 0)];
        int j = 0;
        for (int i = 0; i < (int) Math.sqrt(number); i++) {
            if (number % (i + 1) == 0) {
                array[j] = (i + 1);
                array[array.length - j - 1] = number / (i + 1);
                j++;
            }
        }
        return array;
    }
}
