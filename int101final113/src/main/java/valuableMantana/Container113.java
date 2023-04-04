package valuableMantana;

import java.util.Arrays;
import utilMantana.*;

public class Container113 {
    //3.1
    private final Item113[] item = new Item113[113];

    //3.2 ทำไม่เป็นจ่ะ
    @Override
    public String toString() {
        return "Container113{" +
                "item=" + Arrays.toString(item) +
                '}';
    }

    /* ที่ถูกคือแบบนี้ 3.2
    public String toString() {
      var b = new StringBuilder();
      b.append("Container999{").append(Tool999.count999(items)).append(':');
      for (Item999 item : items) {
         if (item != null) b.append(item.toString());
      }
      return b.append('}').toString();
   }
   */

    public boolean add(Item113 item){
        if (item == null) return false;

        //does not match any
        if (){

        }
    }
}
