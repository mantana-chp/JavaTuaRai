package org.example;

public class Main {
    public static void main(String[] args) {
//        demo();
        demoCard();
    }

    public static void demoCard() {
        PlatinumCard p1 = new PlatinumCard();
        System.out.println("Platinum: " + p1.discount(1000f));
        System.out.println("ได้คะแนนสะสมทั้งสิ้น " + p1.calcPoint(+ 1000f));

        GoldCard g1 = new GoldCard();
        System.out.println("Gold: " + g1.discount(2000f));

        SilverCard s1 = new SilverCard();
        System.out.println("Silver: " + s1.discount(3000f));
    }

    //จะไม่สามารถทำงานได้เพราะกำหนดไว้ว่าเป็น abstract method
//    public static void demo() {
//        MemberCard m1 = new MemberCard("Peter", "Parker");
//        System.out.println(m1.toString());
//    }
}