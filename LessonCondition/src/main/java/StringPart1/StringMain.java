package StringPart1;

public class StringMain {
    public static void demo1() {
        String s1 = "Rain";
        String s2 = "bow";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(s3.length()); //หาความยาวของคำว่าRainbow = 7ตัว

        System.out.println(s3.substring(0,4)); //เอาแค่ตัวอักษรบางตัวออกมา (0,4)คือตำแหน่งของตัวอักษรตั้งแต่0-4 = Rain
                                               //(inclusive,exclusive)
        System.out.println(s3.toUpperCase());
    }

    public static void demoCompare() {
        String s1 = "apple";
        if (s1 == "apple") {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void demoCompare2() {
        String s1 = "apple";
        String s2 = "app";
        System.out.println(s2 + "le");
        if (s1 == (s2 + "le")) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
    public static void demoCompare3() {
        String s1 = "apple";
        String s2 = "App";
        System.out.println(s2 + "le");
        if (s1.equals (s2 + "le")) { //การเปรียบเทียบค่าของStringที่ถั่วต้ม ใช้.equals
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }


    public static void main(String[] args) {
        demoCompare3();
    }
}
