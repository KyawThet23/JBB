package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e2");
        var deFault = new Customer("unknown","unknownEmail");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(deFault.getEmail(), deFault);

//        var customer1 = map.get("a");
//        System.out.println(customer1);
//        var customer2 = map.getOrDefault("c4",deFault);
//        System.out.println(customer2);

        for (var key : map.keySet())
            System.out.println(map.get(key));

        for (var entry : map.entrySet())
            System.out.println(entry);
    }

}
