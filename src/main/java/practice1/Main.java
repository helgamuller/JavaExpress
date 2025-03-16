package practice1;

import practice2.Library;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 2023);
        car.setYear(2022);
        car.print();

        Rectange rectange = new Rectange(30, 40);
        rectange.setWeight(1);
        System.out.println(rectange.calculateArea());

        Book book = new Book("Harry Potter", "Joan Rouling");
        book.setAuthor("Agthata Kristy");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Ivanoff", 100);
        bankAccount.deposit(50);
        bankAccount.printBalance();
        bankAccount.withdraw(40);
        bankAccount.printBalance();

        Point point = new Point(4, 6);
        point.setX(6);
        point.print();

        StudentGroup studentGroup = new StudentGroup("QA", 34);
        studentGroup.setStudentCount(44);
        studentGroup.printInfo();

        Circle circle = new Circle(133.5);
        circle.setRadius(14.5);
        System.out.println("Area is: "+ circle.calculateArea() + ", Circumference is : "+circle.calculateCircumderence());

        Teacher teacher = new Teacher("Anna Ivanovna", "Phisics");
        teacher.setSubject("Science");
        teacher.printInfo();

        Product product = new Product("Cucumber", 100);
        product.setPrice(200);
        product.applyDiscount(5);
        product.printInfo();

        Laptop laptop = new Laptop("Apple", 950);
        laptop.setPrice(1100);
        laptop.printInfo();

        Library library1 = new Library();
        String cathegory = library1.cathegory;

    }
}
