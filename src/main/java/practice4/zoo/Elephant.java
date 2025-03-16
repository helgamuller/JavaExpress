package practice4.zoo;

public class Elephant extends Animal{
    @Override
    public void move() {
        System.out.println("I walk very slow");
    }

    @Override
    public void makeSound() {
        System.out.println("I make a loud sound using my trunk");
    }
}
