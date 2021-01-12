package ru.ssau.tk.pointclasses;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int count = 0;

    @Override
    public int nexInt() {
        return count++;
    }

    @Override
    public void reset() {
        count = 0;
    }
}
