package System.Service;

import java.util.TreeMap;

public class ConsistentHashContainer {


    private TreeMap<Integer,Service> container = new TreeMap<>();

    public void AddService(Service service){
        container.put(service.hashCode(),service);
    }






}
