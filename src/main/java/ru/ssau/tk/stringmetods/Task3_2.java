package ru.ssau.tk.stringmetods;

public class Task3_2 {
    public void str(String str) {
        byte[] bytes = str.getBytes();
        for (byte byt : bytes) {
            System.out.println(byt);
        }
    }
}
