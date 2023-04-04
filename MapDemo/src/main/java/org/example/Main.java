package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Map<String, String> m = new HashMap<String, String>();
        m.put("cn", "China"); //(key, value)
        m.put("th", "Thailand");
        m.put("jp", "Japan");

//        System.out.println(m.get("th"));
        // Iterate เพื่อขอเข้าถึงvalueทุกตัว

//        for (Map.Entry <String, String> item : m.entrySet()) {
//            String key = item.getKey();
//            String value = item.getValue();
//            System.out.printf("%s => %s\n", key, value);
//        }

        if (m.containsKey("Japan")) {
            System.out.println("found Japan");
        }

        if (m.containsKey("cn")) {
            System.out.println("found key cn");
            m.remove("cn"); //เป็นการลบ cn ทิ้ง
            for (Map.Entry <String, String> item : m.entrySet()) {
                String key = item.getKey();
                String value = item.getValue();
                System.out.printf("%s => %s\n", key, value);
            }
        }



        m.put("th", "Siam"); //ถ้าใช้ key ซ้ำกันจะเป็นการ replace value ตัวก่อนหน้า
    }
}