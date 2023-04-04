package valuableMantana;

import utilMantana.*;

public class Item113 {

    //2.1
    private final String name;
    private int amount;

    //2.2
    public Item113(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    //2.3
    public static Item113 create(String name, int amount) {
        if (Tool113.isUsable113(name) && amount > 0) {
            return new Item113(name, amount);
        }
        return null;
    }

    //2.4
    @Override
    public String toString() {
        return "(" + name + "," + amount + ")";
    }

    //2.5
    public int add(Item113 item) {
        if (item == null) return -1; //กันnull ให้return -1
        amount += item.amount;
        return amount;
    }

    //2.6
    public boolean isMatched(Item113 item) {
        if (name == item.name) {
            return true;
        } else {
            return false;
        }
    }
}
