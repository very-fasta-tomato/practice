package ru.ssau.tk.stringmetods;

public class Task3_3 {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = new String(str);
        if (str == str1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (str.equals(str1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
