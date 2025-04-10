package FinalTasks.EntityManager;

import org.junit.jupiter.api.BeforeEach;

public class EntityManagerCommon {
    protected EntityManager manager;
    protected Entity entity;

    @BeforeEach
    public void setupTest(){
        manager = new EntityManager<>();
        entity = new Entity(20, "Olga", false);
    }
}
