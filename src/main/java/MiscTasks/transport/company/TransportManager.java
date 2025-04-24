package MiscTasks.transport.company;

import java.util.List;

public class TransportManager {
    public List<Vehicle> availableTransport(int capacity){
        List<Vehicle> availableTransport = Vehicle.listOfTransport.stream()
                .filter(c-> c.getCapacity()==capacity)
                .toList();

        return availableTransport;
    }

}
