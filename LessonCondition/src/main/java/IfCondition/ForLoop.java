package IfCondition;

public class ForLoop {
    public static void demo1(){
        for (int i=1;i<=5;i=i++){ // i=i+1
            System.out.println(i);
            System.out.println("----");
        }
        System.out.println("Bye");
    }
    public static void demo2(){
        for (int i=1;i<=10;i=i+2){
            System.out.println(i);
            System.out.println("----");
        }
        System.out.println("Bye");
    }
    public static void demo3(){
        for (int i=10;i>=1;i=i-1){
            System.out.println(i);
        }
    }
    public static void sum1(){
        int result = 0;
        for (int i=1;i<=10;i++){
            result = result + i;
        }
        System.out.println(result);
    }
    public static int sum(int fromNum, int toNum){
        int result = 0;
        for (int i=fromNum;i<=toNum;i++){
            result = result + i;
        }
        return result;
    }

    public static void multiplicationTable(int n){
        for (int i = 1; i <= 12; i++)
            System.out.println(n + " x " + i + " = " + n*i);
    }
    public static void printChar(){
        for (char c = 'A'; c <= 'Z'; c++)
            System.out.println(c);
    }
    public static void main(String[] args) {
    //    multiplicationTable(5);
        printChar();
    }
}
