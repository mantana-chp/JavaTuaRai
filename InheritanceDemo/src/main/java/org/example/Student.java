package org.example;

//child class, derived class เป็นคลาสลูกของPerson
//ข้อจำกัด : สืบทอดได้แค่ class เดียว
public class Student extends Person{ //syntax คือ ใส่ extends ___ ชื่อของParent class
    private String faculty, major;
    private Address address; //ถ้าอยากเก็บตัว Address ด้วย ก็ใส่แบบนี้

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
