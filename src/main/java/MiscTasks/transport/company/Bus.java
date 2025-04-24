package MiscTasks.transport.company;

public class Bus extends Vehicle{
    public Bus(String name, int capacity, String model) {
        super(name, capacity, model);
        listOfTransport.add(this);
    }

    @Override
    public void transportationCapacity() {
        System.out.println("I am a bus. My model is " + getModel() + " I can transport " + getCapacity()+ " people");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", model='" + model + '\'' +
                '}';
    }
}
