package MiscTasks.transport.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    String name;
    int capacity;
    String model;
    protected static List<Vehicle> listOfTransport = new ArrayList<>();
    //transport company
    //two types of vehicles: bus, car
    //method to transport(provide a capacity)
    //transport manager  - pass capacity ->return a list of vehicle

    public Vehicle(String name, int capacity, String model) {
        this.name = name;
        this.capacity = capacity;
        this.model = model;
    }

    public abstract void transportationCapacity();
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", model='" + model + '\'' +
                '}';
    }
}
