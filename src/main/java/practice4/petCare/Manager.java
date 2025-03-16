package practice4.petCare;

public class Manager {
    public void acceptNewPet(){
        System.out.println("New pet is accepted!");
    }
    public void giveCare(Pet pet) {
        pet.feed();
        pet.interact();
    }
}
