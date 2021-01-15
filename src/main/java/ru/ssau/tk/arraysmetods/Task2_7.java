package ru.ssau.tk.arraysmetods;

public class Task2_7 {
    static double[] solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{-c / b};
        }

        double D = b * b - 4 * a * c;
        if (D < 0) {
            return new double[]{};
        } else if (D == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            double[] array = new double[2];
            array[0] = (-b + Math.sqrt(D)) / 2;
            array[1] = (-b - Math.sqrt(D)) / 2;
            return array;
        }
    }
}
