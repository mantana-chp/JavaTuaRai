package IfCondition;

public class WhileLoop {
    public static void demo(){
        int i = 1;
        while (i <= 10){ //ตรวจสอบเงื่อนไขก่อนลูป
            System.out.println(i);
            i++;
        }
    }
    public static void demo2(){
        int i = 1;
        do { //ทำก่อนแล้วค่อยตรวจสอบเงื่อนไข
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
    // ฝากเงิน100 ดอกเบี้ย5% อยากได้200
    //100 * 1.05 > 105
    //105 * 1.05 >
    public static void saving(){
        float deposit = 100.0f;
        float rate = .05f;
        int years = 1;
        float balance = deposit * (1 + rate);
        while (balance <= 200.0f) {
            System.out.println("end of year: " + years + " balance = " + balance);
            balance = balance * (1 + rate);
            years++;
        }
        System.out.println("end of year: " + years + " balance = " + balance);
    }
    //void ไม่ส่งค่ากลับมา
    public static int saving2(float deposit, float rate, float targetAmount){
        int years = 1;
        float balance = deposit * (1 + rate);
        while (balance <= targetAmount) {
            System.out.println("end of year: " + years + " balance = " + balance);
            balance = balance * (1 + rate);
            years++;
        }
        System.out.println("end of year: " + years + " balance = " + balance);
        return years;
    }
    public static void main(String[] args) {
        int n =saving2(100.0f, .05f, 150.0f);
        System.out.println("years needed = "+ n);
    }
}
