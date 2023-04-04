package org.example;

import java.time.LocalDate;
import java.time.Period;

//parent class, superclass
//ข้อดี ถ้าเปลี่ยนแปลง/ถ้าเพิ่ม property ในclass person ก้จะถ่ายทอดไปให้child classด้วย
//abstract ทำหน้าที่เป็น parent ให้classอื่น แต่ไม่ต้องการให้สร้าง instance โดยตรงจากคลาสนี้ *abstract*
public class Person {

    private static String firstName, lastName;
    private static String gender; //[M]ale; [F]emale
    private LocalDate dob; //date of birth ยกตย.เพิ่มการนับอายุจากวันเกิด

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Person.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Person.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int ageYears() {
        Period p = Period.between(dob, LocalDate.now());
        return p.getYears();
    }
}
