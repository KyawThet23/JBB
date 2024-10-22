package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

//testing
    public static void show(){

        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        for (var item : collection)
            System.out.println(item);

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list.indexOf("c"));
    }
}
