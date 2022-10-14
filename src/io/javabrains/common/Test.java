package io.javabrains.common;

public class Test {

    int number;

    public Test(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
