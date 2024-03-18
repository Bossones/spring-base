package ru.bossones.dependencyinjection;

public class ConstructorDiWithSameArgs {

    private String a;
    private int b;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ConstructorDiWithSameArgs{" +
            "a='" + a + '\'' +
            ", b=" + b +
            '}';
    }

    public String getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
