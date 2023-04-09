package org.example;

import things.Car;

public class Int101review1 {
    public static void main(String[] args) {
//        reviewLiterals();
        testCar();
    }

    private static void testCar() {
        Car car = new Car("Toyota", "Bangkok", "BNK48", 628_567.00);
        System.out.println("My New Car: " + car);
        System.out.println("Get Brand: " + car.getBrand());
        car.setBrand("Honda");
        car.setCity("Chonburi");
        System.out.println("My New Car: " + car.toString());
        System.out.println("Brand of my car: " + car.getBrand());
        System.out.println("New increased Price: " + car.increasePrice(1_000_000));
        System.out.println("Car: " + car);
    }

    //Literals
    static void reviewLiterals() {
        // datat type : primitive types, reference type.
        boolean bl;
        char ch; //2-byte 16 bits unicode
        byte by; //1-byte 8 bits
        short sh; //2-byte 16 bits
        int i; //4-byte 32 bits
        long lng; //8-byte 64 bits
    }
}