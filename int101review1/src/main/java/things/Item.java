package things;

public class Item {
    //access modifier
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name) {
        this(name,0.0);//เขียนแบบนี้ก็ได้
    }

    //getter อ่านได้อย่างเดียว , setter สามารถกำหนดค่าได้/เปลี่ยนค่าได้

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
