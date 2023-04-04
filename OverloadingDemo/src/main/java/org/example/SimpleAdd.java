package org.example;

public class SimpleAdd {
    public static double add(double n1, double n2) {
        return n1 + n2;
    }
    //return type double กับ float ไม่ถือว่ามีความแตกต่าง(ไม่เป็นsignature)
    //โปรแกรมจะเตือนว่า add(double n1, double n2) ถูกใช้ไปแล้ว
//    public static float add(double n1, double n2) {
//        return (float)(n1 + n2);
//    }
    //แก้เป็น >>
    public static float add(float n1, float n2) {
        return (n1 + n2);
    }

    //ชื่อmethodเหมือนกัน แต่จำนวนพารามิเตอร์มีความแตกต่าง(signature)
    public static double add(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

}
