package Collections.collections.TreeMap;

import java.util.TreeMap;
//Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

public class Employees {
    private TreeMap<Integer, String> employee;

    public Employees(){
        this.employee = new TreeMap<>();
    }
    protected void addEmployee(Integer id, String surname){
        employee.put(id, surname);
    }
    protected void print(){
        employee.forEach((key, value)-> System.out.println(key + " " + value));
        System.out.println();
    }
    protected void nextLarger(Integer id){
        Integer nextLarger = employee.higherKey(id);
        System.out.println("For id " + id + " next larger id is " + nextLarger);
    }
}
