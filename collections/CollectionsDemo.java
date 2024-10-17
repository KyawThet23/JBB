package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {

    public static void show(){

        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        for (var item : collection)
            System.out.println(item);
    }
}
