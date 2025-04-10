package FinalTasks.EntityManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager <T extends Entity>{
    private List<T> list;

    public EntityManager(){
        this.list = new CopyOnWriteArrayList<>();
    }

    public synchronized void addEntity(T t){
        list.add(t);
    }

    public synchronized boolean removeEntity(T t) {
        if(!list.contains(t)) {
            return false;
        }
        else {
         return list.remove(t);
        }
    }
    public List<T> returnAllEntities(){
        List<T> copyOfList = new ArrayList<>(list);
        return copyOfList;
    }

    public List<T> filteredByAge(int minAge, int maxAge){
        return list.stream()
                .filter((entity->entity.getAge()>=minAge && entity.getAge()<=maxAge))
                        .collect(Collectors.toList());
    }

    public List<T> filteredByName(String name){
        return list.stream()
                .filter(entity->entity.getName().toLowerCase().equals(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<T> filteredByStatus(boolean status){
       return list.stream()
               .filter(entity -> entity.getStatus()==status)
               .toList();
    }

    public void printer(){
        list.forEach(System.out::println);
        System.out.println();
    }
    public static void main(String[] args) {
        Entity entity = new Entity(24,"Olga",  true);
        Entity entity1 = new Entity(45,"Anna",  false);
        Entity entity2 = new Entity(150,"Ivan",  true);
        EntityManager manager = new EntityManager();

        manager.addEntity(entity1);
        manager.addEntity(entity);
        manager.addEntity(entity2);


        System.out.println(manager.filteredByAge(22,100));
        System.out.println(manager.filteredByName("Olga"));
        System.out.println(manager.filteredByStatus(true));

    }




}
