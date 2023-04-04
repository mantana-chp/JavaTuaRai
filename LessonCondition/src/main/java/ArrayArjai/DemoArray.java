package ArrayArjai;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {
    public static void demo1() {
        int score1, score2, score3, score4, score5; //เขียนแบบปกติ
        score1 = 10;
        score2 = 15;
        score3 = 20;
        score4 = 25;
        score5 = 30;
        int sum = score1+score2+score3+score4+score5;
        System.out.println(sum);

        int[] scores = new int[6]; //0-5
        scores[0] = 10;
        scores[1] = 15;
        scores[2] = 20;
        scores[3] = 25;
        scores[4] = 30;
        scores[5] = 100;
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++){
            sum2 = sum2 + scores[i];
        }
        System.out.println(sum2);
    }
    public static void demo2(){
        int[] scores = {10, 15, 20, 25, 30, 100}; //เขียนแบบย่อ ประเภทข้อมูลต้องเหมือนกัน intก็ต้องเป็นintทั้งหมด
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++){
            sum2 = sum2 + scores[i];
        }
        System.out.println(sum2);
    }

    public static void demo3() { //ArrayแบบString
        String[] coffee = {"Mocha", "Espresso"};
        for (int i = 0; i < coffee.length; i++){
            System.out.println(coffee[i]);
        }
    }


    //Arrays 2 มิติ
    public static void demo4() {
        String[] provinces = {"กรุงเทพ", "เชียงใหม่", "ภูเก็ต", "ขอนแก่น"}; //เขียนแบบArrayปกติ
        String[] abbr = {"กทม", "ชม", "ภก", "ขก"};

        String[][] provinces2 = new String[4][2]; // Array 2 มิติ
        provinces2[0][0] = "กรุงเทพ";
        provinces2[0][1] = "กทม";
        provinces2[1][0] = "เชียงใหม่";
        provinces2[1][1] = "ชม";
        provinces2[2][0] = "ภูเก็ต";
        provinces2[2][1] = "ภก";
        provinces2[3][0] = "ขอนแก่น";
        provinces2[3][1] = "ขก";

        String[][] provinces3 = { //Array 2 มิติ
                {"กรุงเทพ", "กทม"},
                {"เชียงใหม่", "ชม"},
                {"ภูเก็ต", "ภก", "Phuket"},
                {"ขอนแก่น", "ขก"}
        };

        for (int i = 0; i< provinces3.length; i++) { //4 rows
            for (int j = 0; j < provinces3[i].length; j++) { //2 columns
                System.out.printf("provinces3[%d][%d] = %s\n", i, j, provinces3[i][j]);
            }
        }
    }
    public static void demoSortNumber() { //เรียงลำดับArrays
        int[] n = {28, 32, 55, 9, 40};
        Arrays.sort(n);
        System.out.println(Arrays.toString(n)); //การเขียนอีกแบบ
//        for (int i = 0; i < n.length; i++){
//            System.out.println(n[i]);
//        }
    }

    public static void demoSortString() {
        String[] coffees = {"Mocha", "Latte", "Espresso"};
        System.out.println("Before---");
        System.out.println(Arrays.toString(coffees));

        System.out.println("After---");
        Arrays.sort(coffees);
        System.out.println(Arrays.toString(coffees));

    }

    public static void demoT1(int[] x) {
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * 10 ;
        }
    }
    public static void t1() {
        int[] n = {2, 4, 6, 8};
        System.out.println(Arrays.toString(n));
        demoT1(n);
        System.out.println(Arrays.toString(n));
    }

    public static void demoT2(int x) {
        x = x * 10;
    }

    public static void t2() {
        int n = 10;
        demoT2(n);
        System.out.println(n);
    }

    public static void main(String[] args) {
//        demoSortString();
//        demo4();
        t2();
    }
}
