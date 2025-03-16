package practice1;

public class Car {
    String brand;
    int year;

    Car(String SomeBrand, int aYear) {
        this.brand=SomeBrand;
        this.year = aYear;
    }
    //getters
    public String getBrand(){
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }
    //setters

    public void setYear(int year) {
        this.year = year;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void print() {
        System.out.println("Brand is :" + this.brand + "," + "Year is: " + this.year +".");
    }

}
