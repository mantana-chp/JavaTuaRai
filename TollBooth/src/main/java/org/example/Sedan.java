package org.example;

//implements = ต้อง implement ทุก method ที่อยุ่ภายใต้ Class Vehical
public class Sedan implements Vehicle {

    @Override
    public int cashRate() {
        return 40;
    }

    @Override
    public int ePAssRate() {
        return 35;
    }
}
