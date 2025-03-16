package practice4.petCareSystem;

public class Dog extends Pet{
    @Override
    public void toFeed() {
        System.out.println("I eat dry food");
    }

    @Override
    public void toCare() {
        System.out.println("I like to walk!");
    }
}
