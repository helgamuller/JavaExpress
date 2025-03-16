package practice4.zoo;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal elephant = new Elephant();
        ZooManager manager = new ZooManager();
        manager.addAnimal();
        manager.showBehaviour(bird);
        manager.showBehaviour(elephant);
    }
}
