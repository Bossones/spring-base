package ru.bossones.methodinjection;

public class Prototype {

    private final int a;
    private final int b;

    public Prototype(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + a + " " + b;
    }
}
