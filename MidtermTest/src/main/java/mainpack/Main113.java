package mainpack;

import obj.Mantana.*;
import util.Mantana.*;

//5
public class Main113 {
    public static void main(String[] args) {
        testUtilMantana();
        testObj113();
    }

    private static void testUtilMantana() {
        UtilMantana.compute113RightTriangleArea(1,2);
        UtilMantana.evaluate113(20);
        UtilMantana.computeMagicMantana(2,5,3);
//        System.out.println(UtilMantana.compute113RightTriangleArea(1,2));
//        System.out.println(UtilMantana.evaluate113(50));
//        System.out.println(UtilMantana.computeMagicMantana(2,5,3));
    }

    private static void testObj113() {
        Obj113 a = new Obj113("113","object1",30);
        Obj113 b = new Obj113("114","object2",20);
        System.out.println(Obj113.compare(a,b));
        System.out.println(a.isGreaterThan(b));
    }




}
