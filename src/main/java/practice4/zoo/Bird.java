package practice4.zoo;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("I am fly!");
    }

    @Override
    public void makeSound() {
        System.out.println("I say chikchirikchirik!");
    }
}
