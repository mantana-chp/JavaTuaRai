package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Lab01() {
        for (int i=1;i<=100;i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //สร้างคำตอบเเบบ Random ให้กับคำถาม Yes-No
    //โดยโปรเเกรมจะตอบคำถามประมาณนี้
    //"Yes" "No" "Maybe" "I'm not sure" "Try again"
    public static void Lab02() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ask me something: ");
        String Question = myObj.nextLine();

        String answer1 = "Yes";
        String answer2 = "No";
        String answer3 = "Maybe";
        String answer4 = "I'm not sure";
        String answer5 = "Try again";

        Random rand = new Random();
        int a = rand.nextInt(5)+1;

        if (a==1) {
            System.out.println("Magic 8 balls says : " + answer1);
        } else if (a==2) {
            System.out.println("Magic 8 balls says : " + answer2);
        } else if (a==3) {
            System.out.println("Magic 8 balls says : " + answer3);
        } else if (a==4) {
            System.out.println("Magic 8 balls says : " + answer4);
        } else {
            System.out.println("Magic 8 balls says : " + answer5);
        }
    }
    //ให้น้องเขียนโปรเเกรมที่ print เลข 1-100
    //โดยที่หากว่าตัวเลขนั้นหาร 3 ลงตัวให้ print "Fizz" เเทนตัวเลขตัวนั้น
    // หากหาร 5 ลงตัวให้ print คำว่า "Buzz" เเทนตัวเลขตัวนั้น
    //หากหารได้ทั้งเลข 3 เเละ 5 ให้ print "FizzBuzz"
    public static void Lab01A() {
        int i = 1;
        for (i=1;i<=100;i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void Lab01B() {
        for (int i=1;i<=100;i++) {
//            System.out.println(i);
            if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Lab01();
//        Lab02();
//        Lab01A();
//        Lab01B();
    }
}
