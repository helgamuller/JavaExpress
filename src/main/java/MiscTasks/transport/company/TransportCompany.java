package MiscTasks.transport.company;

import java.util.List;

public class TransportCompany {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota", 3, "Prius");
        Vehicle car2 = new Car("Toyota", 6, "Odissey");
        Vehicle bus1 = new Bus("Mercedes", 10, "GLK");
        Vehicle bus2 = new Bus("Mercedes", 15, "GLK1");

        car1.transportationCapacity();
        bus2.transportationCapacity();

        TransportManager manager = new TransportManager();
        List<Vehicle> list = manager.availableTransport(10);
        System.out.println(list);
    }
    }

