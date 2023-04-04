package org.example;

public class Main {
    public static void main(String[] args) {
        //method overloading ใน class 1 class สามารถมีชื่อ method ที่เหมือนกันได้
//        String s = "sunflower";
//        System.out.println(s.substring(3)); //print โดยเริ่มจากตัวที่3 คือf ตัวแรก=0 >> flower
//        System.out.println(s.substring(3,7)); //เริ่ม3 ไม่นับตำแหน่งที่7(เป็นexclusive) >> flow
//
//        System.out.println(SimpleAdd.add(1.2,3));

        System.out.println(DiscountCalc.discount(100f));
        System.out.println(DiscountCalc.discount(100f, .1f));
        System.out.println(DiscountCalc.discount(100f, "VIP"));

    }
}