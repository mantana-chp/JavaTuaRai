package things;

public class Car {
    String brand;
    String city;
    String licenseNumber;
    double price;

    public Car(String brand, String city, String licenseNumber, double price) {
        this.brand = brand;
        this.city = city;
        this.licenseNumber = licenseNumber;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double increasePrice(double cost) {
        price = price + cost;
        return price;
    }

    public double decreasePrice(double discount) {
        price = price - discount;
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", city='" + city + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
