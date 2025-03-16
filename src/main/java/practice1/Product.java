package practice1;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return  this.name;
    }
    public double getPrice() {
        return  this.price;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public void applyDiscount(double discount) {
        double discountedPrice = (100-discount)*this.price/100;
        this.price = discountedPrice;
    }

    public void printInfo() {
        System.out.println("Grocery: " + this.name + ", Price: "+ this.price);
    }
}

