package MapCountry;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public static void demo1() {
        Map<String, String> m = new HashMap<String, String>();
        m.put("th", "Thailand");
    }

    public static void demo2() {
        Map<String, Country> m = new HashMap<String, Country>();
        m.put("th", new Country("ไทย", "Thailand"));
        m.put("jp", new Country("ญี่ปุ่น", "Japan"));
        m.put("cn", new Country("จีน ", "China"));

    }
}
