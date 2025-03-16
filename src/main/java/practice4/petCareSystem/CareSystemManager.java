package practice4.petCareSystem;

public class CareSystemManager {
    void acceptNewPet() {
        System.out.println("We just accepted a new pet");
    }
    void iteract(Pet pet) {
        pet.toCare();
        pet.toFeed();
    }
}
