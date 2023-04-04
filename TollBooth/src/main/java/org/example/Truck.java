package org.example;

public class Truck implements Vehicle{
    @Override
    public int cashRate() {
        return 80;
    }

    @Override
    public int ePAssRate() {
        return 70;
    }
}
