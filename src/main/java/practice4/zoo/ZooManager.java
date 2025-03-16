package practice4.zoo;

public class ZooManager {
    public void addAnimal(){
        System.out.println("New animal is added, my general!");
    }
    public void showBehaviour(Animal animal) {
        animal.move();
        animal.makeSound();
    }
}
