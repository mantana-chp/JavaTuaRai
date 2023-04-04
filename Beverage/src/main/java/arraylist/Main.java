package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        demoArrayList1();
    }
    public static void demoArrayList1(){
        //ArrayList เพิ่มสมาชิกได้เรื่อยๆ แต่Arrayต้องมาแก้จำนวนสมาชิกเอง
        //แบบที่1
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("Orange", "Juice", 40)); //0
        menus.add(new Drink("Apple", "Juice", 45)); //1
        menus.add(new Drink("lemon", "Juice", 50)); //2
        menus.add(new Drink("Coke", "Soda", 20)); //3
        menus.add(new Drink("Sprite", "Soda", 20));
        menus.add(new Drink("Fanta", "Soda", 20));
        menus.add(new Drink("Latte", "Coffee", 60));

        //เรียงข้อมูลตามราคาเครื่องดื่ม
        Comparator<Drink> cmpPrice = new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };
        Collections.sort(menus, cmpPrice);

//        System.out.println(menus.get(3)); //แสดงCokeออกมา ตัวแรก=0
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }
    }

}
