package practice4.petCare;

public class Dog extends Pet{
    @Override
    public void feed() {
        System.out.println("I am a dog and I eat dty food");
    }

    @Override
    public void interact() {
        System.out.println("I am a dog and I like to walk!");
    }
}
