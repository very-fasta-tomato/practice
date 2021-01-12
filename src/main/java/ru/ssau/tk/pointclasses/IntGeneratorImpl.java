package ru.ssau.tk.pointclasses;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nexInt() {
        return count++;
    }
}
