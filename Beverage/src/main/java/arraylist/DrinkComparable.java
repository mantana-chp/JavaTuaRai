package arraylist;

public class DrinkComparable implements Comparable<Drink>{
    private String menu, category;
    private int price;

    public DrinkComparable(String menu, String category, int price) {
        this.menu = menu;
        this.category = category;
        this.price = price;
    }
    public DrinkComparable() { //constructor แบบไม่มีพารามิเตอร์
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "menu='" + menu + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    //comparatorจะมีพารามิเตอร์2ตัว
    @Override
    public int compareTo(Drink o) { //Comparable มีพารามิเตอร์ตัวเดียว จะถูกimplementภายในclassเท่านั้น
        return this.getMenu().compareToIgnoreCase(o.getMenu()); // IgnoreCase =ไม่สนตัวเล็กตัวใหญ่

    }
}
