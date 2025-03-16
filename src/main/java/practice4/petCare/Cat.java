package practice4.petCare;

public class Cat extends Pet{
    @Override
    public void feed() {
        System.out.println("I am a cat an I eat wet food");
    }

    @Override
    public void interact() {
        System.out.println("I am a cat and I like to play");
    }
}
