package org.example;

public class Bus implements Vehicle {
    @Override
    public int cashRate() {
        return 100;
    }

    @Override
    public int ePAssRate() {
        return 90;
    }
}
