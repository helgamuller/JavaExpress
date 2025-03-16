package practice4.petCareSystem;



public class Cat extends Pet{
    @Override
    public void toFeed() {
        System.out.println("I eat wet food");
    }

    @Override
    public void toCare() {
        System.out.println("I like to play");
    }
}
