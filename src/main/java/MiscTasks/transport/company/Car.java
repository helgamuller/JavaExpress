package MiscTasks.transport.company;

public class Car extends Vehicle{
    public Car(String name, int capacity, String model) {
        super(name, capacity, model);
        listOfTransport.add(this);
    }

    @Override
    public void transportationCapacity() {
        System.out.println("I am a car. My model is " + getModel() + " I can transport " + getCapacity()+ " people");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
