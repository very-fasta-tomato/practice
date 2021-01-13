package ru.ssau.tk.task4_8;

public class UnChecked extends RuntimeException {
    UnChecked(Checked a) {
        super(a);
    }
}
