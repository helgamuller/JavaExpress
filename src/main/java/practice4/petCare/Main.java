package practice4.petCare;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Pet cat = new Cat();
        Pet dog = new Dog();
        manager.acceptNewPet();
        manager.giveCare(dog);
        manager.giveCare(cat);
    }
}
