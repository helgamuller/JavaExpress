package FinalTasks.EntityManager;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTests extends EntityManagerCommon{

    /**
     * addEntity
     * Positive cases:
     *      23, "Olga", true
     * Corner cases:
     *      0, "Olga", false
     *      45, "", true
     * Negative case:
     *      null, null, null
     *
     */
    public static Stream<Arguments> validEntities(){
        return Stream.of(
                Arguments.of(new Entity(0, "Olga", true)),
                Arguments.of(new Entity(45, "", false))


        );
    }

    @ParameterizedTest
    @MethodSource("validEntities")
    @DisplayName("Succsesfull adding")
    public void userCanAddEntityIntoList(Entity entity){
        manager.addEntity(entity);
        List<Entity> result = manager.returnAllEntities();
        assertTrue(result.contains(entity));
    }
    @Test
    @DisplayName("User Can Not Add Null Entity")
    public void userCanNotAddEntityIntoList(){
        manager.addEntity(null);
        List<Entity> result = manager.returnAllEntities();
        assertFalse(result.contains(entity));
    }

    /**
     * Positive case:
     *      contains entity -> true
     * Negative case:
     *      doesn't contain entity - >false
     * Corner:
     *      null ->fasle
     *
     */
    public static Stream<Arguments> invalidEntitiesToBeRemoved(){
        return Stream.of(
                Arguments.of(new Entity(11, "Anna", false))

        );
    }

    @ParameterizedTest
    @MethodSource("invalidEntitiesToBeRemoved")
    @DisplayName("User Can Not Remove Entity")
    public void userCanNotRemoveEntity(boolean expectedResult, Entity entity){
        boolean isRemoved = manager.removeEntity(entity);
        assertEquals(expectedResult, isRemoved);

    }
    @Test
    @DisplayName("User Can Remove Entity")
    public void userCanRemoveEntity(){
        manager.addEntity(entity);
        assertTrue(manager.removeEntity(entity));

    }

    /**
     * Positive:
     *      return entity
     * Negative:
     *      can't find entity
     *  Corner:
     *      border value
     */

    public static Stream<Arguments> validDataForAgeFiltration(){
            return Stream.of(
                    Arguments.of(10, 25),
                    Arguments.of(10, 20)
            );

    }
    @ParameterizedTest
    @MethodSource("validDataForAgeFiltration")
    @DisplayName("User can filter list by age")
    public void userCanFilterListByAgeRange(int minAge, int maxAge){
        List<Entity> initialList = new CopyOnWriteArrayList<>(List.of(entity));
        manager.addEntity(entity);
        List<Entity> actualResult = manager.filteredByAge(minAge, maxAge);
        assertEquals(initialList, actualResult);

    }
    @Test
    @DisplayName("User can not filter list by age")
    public void userCanNotFilterListByAgeRange(){
        List<Entity> initialList = new CopyOnWriteArrayList<>(List.of(entity));
        manager.addEntity(entity);
        List<Entity> actualResult = manager.filteredByAge(5, 15);
        assertNotEquals(initialList, actualResult);

    }

    /**
     * Positive:
     *      Olga
     * Negative:
     *      can't find entity
     *      alga
     *  Corner:
     *      olga
     *
     */
    public static Stream<Arguments> validDataForNameFiltration(){
        return Stream.of(
                Arguments.of("Olga"),
                Arguments.of("olga")
        );

    }
    @ParameterizedTest
    @MethodSource("validDataForNameFiltration")
    @DisplayName("User can filter list by name")
    public void userCanFilterListByName(String name){
        List<Entity> initialList = new CopyOnWriteArrayList<>(List.of(entity));
        manager.addEntity(entity);
        List<Entity> actualResult = manager.filteredByName(name);
        assertEquals(initialList, actualResult);

    }
    @Test
    @DisplayName("User can not filter list by name")
    public void userCanNotFilterListByName(){
        List<Entity> initialList = new CopyOnWriteArrayList<>(List.of(entity));
        manager.addEntity(entity);
        List<Entity> actualResult = manager.filteredByName("alga");
        assertNotEquals(initialList, actualResult);

    }

    @Test
    @DisplayName("User can filter list by status")
    public void userCanFilterListByStatuse(){
        List<Entity> initialList = new CopyOnWriteArrayList<>(List.of(entity));
        manager.addEntity(entity);
        List<Entity> actualResult = manager.filteredByStatus(false);
        assertEquals(initialList, actualResult);

    }
    @Test
    @DisplayName("User can Not filter list by status")
    public void userCanNotFilterListByStatus(){
        List<Entity> initialList = new CopyOnWriteArrayList<>(List.of(entity));
        manager.addEntity(entity);
        List<Entity> actualResult = manager.filteredByStatus(true);
        assertNotEquals(initialList, actualResult);

    }


}
