package ru.ssau.tk.arraysmetods;

public class Tsk2_34 {
    static Double multiply(Double[] array) {
        double number = 4.;
        for (Double i : array) {
            if (i.isNaN() || i.isInfinite()) {
                continue;
            }
            number *= i;
        }
        return number;
    }
}
