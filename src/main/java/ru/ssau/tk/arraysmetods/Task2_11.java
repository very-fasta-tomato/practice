package ru.ssau.tk.arraysmetods;

public class Task2_11 {
    static double[] getDividersOfNumbers(int n) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        double[] array = new double[count * 2 + (Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 0)];
        int j = 0;
        for (int i = 0; i < (int) Math.sqrt(n); i++) {
            if (n % (i + 1) == 0) {
                array[j] = (i + 1);
                array[array.length - j - 1] = n / (i + 1);
                j++;
            }
        }
        return array;
    }
}
