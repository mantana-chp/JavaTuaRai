package org.example;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person(); // ถ้าใส่ *abstract* จะไม่สามารถ set class Person โดยตรงได้
//        p1.setFirstName("Ploy");

        Student s1 = new Student(); //Class Student สืบทอดมาจาก Class Person
            s1.setFirstName("Peter");
            s1.setLastName("Parker");
            s1.setGender("M");
            s1.setFaculty("SIT");
            s1.setMajor("IT");
            s1.setDob(LocalDate.of(2003, Month.JULY, 13));
            System.out.println("Age = " + s1.ageYears());

        ExchangeStudent ex1 = new ExchangeStudent();
        ex1.setFirstName("Ann");
        ex1.setLastName("Swift");
        ex1.setPartnerUniversity("ABC university");
    }

}