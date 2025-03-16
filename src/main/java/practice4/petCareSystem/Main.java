package practice4.petCareSystem;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        CareSystemManager manager = new CareSystemManager();
        manager.acceptNewPet();
        manager.iteract(dog);
        manager.iteract(cat);
    }
}
