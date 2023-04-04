package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainSort {
    public static void main(String[] args) {
        demoArrayList1();
    }
    public static void demoArrayList1(){
        ArrayList<Drink> menus = new ArrayList<Drink>();
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }

//        Collections.sort(menus);
        System.out.println("---------sorted by menu");
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }
    }
}
