package ru.ssau.tk.task1_19;

public class TypePrintClass {
    public static void printType(byte temp) {
        System.out.println("byte");
    }

    public static void printType(char temp) {
        System.out.println("char");
    }

    public static void printType(short temp) {
        System.out.println("short");
    }

    public static void printType(int temp) {
        System.out.println("int");
    }

    public static void printType(long temp) {
        System.out.println("long");
    }

    public static void printType(float temp) {
        System.out.println("float");
    }

    public static void printType(double temp) {
        System.out.println("double");
    }

    public static void printType(boolean temp) {
        System.out.println("boolean");
    }

    public static void printType(Object temp) {
        if (temp == null) {
            System.out.println("null");
        } else {
            System.out.println(temp.getClass());
        }
    }
}
