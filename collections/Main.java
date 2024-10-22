package collections;

import generic.GenericList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var list = new GenericList<String>();
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        // you can write above as like this => byte code still implements hasNext method.
        for (String current : list) {
            System.out.println(current);
        }

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b","e1"));
        customers.add(new Customer("a","e2"));
        Collections.sort(customers,new EmailComparator());
        System.out.println(customers.toString());
    }
}
